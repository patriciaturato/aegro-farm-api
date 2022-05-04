package com.aegro.farm.service;

import com.aegro.farm.entity.Farm;
import org.springframework.stereotype.Service;

@Service
public interface FarmService {
    Farm create(Farm farm);
    Farm update(String id, Farm farm);
    boolean delete(String id);
}
