package com.aegro.farm.service;

import com.aegro.farm.entity.Production;

public interface ProductionService {
    Production create(Production production);
    Production update(String id, Production production);
    boolean delete(String productionId);
}
