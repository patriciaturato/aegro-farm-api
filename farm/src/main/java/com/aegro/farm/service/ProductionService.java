package com.aegro.farm.service;

import com.aegro.farm.entity.Production;

import java.util.List;

public interface ProductionService {
    Production createProduction(Production production);
    Production updateProduction(String id, Production production);
    boolean deleteProduction(String productionId);
    boolean deleteAllProductions(String plotId);
    List<Production> getPlotProductions(String plotId);
}
