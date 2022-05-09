package com.aegro.farm.service;

import com.aegro.farm.entity.Farm;

import java.util.List;

public interface FarmService {
    Farm createFarm(Farm farm);

    Farm updateFarm(String id, Farm farm);

    boolean deleteFarm(String id);
}
