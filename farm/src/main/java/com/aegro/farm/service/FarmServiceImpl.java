package com.aegro.farm.service;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FarmServiceImpl implements FarmService{

    private final FarmRepository farmRepository;

    @Autowired
    public FarmServiceImpl(FarmRepository farmRepository){
        this.farmRepository = farmRepository;
    }
    @Override
    public Farm create(Farm farm) {
        return farmRepository.insert(farm);
    }

}
