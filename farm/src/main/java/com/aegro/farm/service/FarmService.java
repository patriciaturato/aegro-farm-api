package com.aegro.farm.service;

import com.aegro.farm.entity.Farm;

import java.util.List;

public interface FarmService {
    Farm createFarm(Farm farm);
    Farm updateFarm(String farmId, Farm farm);
    boolean deleteFarm(String farmId);
    Farm getFarm(String farmId);
    List<Farm> getAllFarms();
}
