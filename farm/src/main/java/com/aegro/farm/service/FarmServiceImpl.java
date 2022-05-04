package com.aegro.farm.service;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FarmServiceImpl implements FarmService{

    @Autowired
    private FarmRepository farmRepository;

    public FarmServiceImpl(){}
    @Autowired
    public FarmServiceImpl(FarmRepository farmRepository){
        this.farmRepository = farmRepository;
    }
    @Override
    public Farm create(Farm farm) {

        return farmRepository.insert(farm);
    }

    @Override
    public Farm update(String id, Farm farm) {
        farm.setId(id);
        return farmRepository.save(farm);
    }

    @Override
    public boolean delete(String id) {
        farmRepository.deleteById(id);
        return !farmRepository.existsById(id);
    }

}
