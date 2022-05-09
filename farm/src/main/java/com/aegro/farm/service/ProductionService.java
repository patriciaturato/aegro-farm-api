package com.aegro.farm.service;

import com.aegro.farm.entity.Production;

public interface ProductionService {
    Production createProduction(Production production);
    Production updateProduction(String id, Production production);
    boolean deleteProduction(String productionId);
    boolean deleteAllProductions(String plotId);
}
