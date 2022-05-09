package com.aegro.farm.service.implementation;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.repository.FarmRepository;
import com.aegro.farm.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Farm updateFarm(String id, Farm farm) {
        farm.setId(id);
        return farmRepository.save(farm);
    }

    @Override
    public boolean deleteFarm(String id) {
        plotService.deleteFarmPlots(id);
        farmRepository.deleteById(id);
        return !farmRepository.existsById(id);
    }

    public boolean isValid(Farm farm){
        return !(farm.getName().isEmpty() || farm.getName().isBlank());
    }
}
