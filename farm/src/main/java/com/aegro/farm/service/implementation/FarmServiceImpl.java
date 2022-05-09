package com.aegro.farm.service.implementation;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.repository.FarmRepository;
import com.aegro.farm.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImpl implements FarmService {

    @Autowired
    private FarmRepository farmRepository;
    @Autowired
    private PlotServiceImpl plotService;

    public FarmServiceImpl(){}

    @Override
    public Farm createFarm(Farm farm) {
        return farmRepository.insert(farm);
    }

    @Override
    public Farm updateFarm(String farmId, Farm farm) {
        farm.setId(farmId);
        return farmRepository.save(farm);
    }

    @Override
    public boolean deleteFarm(String farmId) {
        plotService.deleteFarmPlots(farmId);
        farmRepository.deleteById(farmId);
        return !farmRepository.existsById(farmId);
    }

    @Override
    public Farm getFarm(String farmId) {
        return farmRepository.findFarmById(farmId);
    }

    @Override
    public List<Farm> getAllFarms() {
        return farmRepository.findAll();
    }

    public boolean isValid(Farm farm){
        return !(farm.getName().isEmpty() || farm.getName().isBlank());
    }
}
