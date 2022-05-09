package com.aegro.farm.service.implementation;

import com.aegro.farm.entity.Production;
import com.aegro.farm.repository.ProductionRepository;
import com.aegro.farm.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    private ProductionRepository productionRepository;

    public ProductionServiceImpl() {
    }

    @Override
    public Production createProduction(Production production) {
        return productionRepository.insert(production);
    }

    @Override
    public Production updateProduction(String id, Production production) {
        production.setId(id);
        return productionRepository.save(production);
    }

    @Override
    public boolean deleteProduction(String productionId) {
        productionRepository.deleteById(productionId);
        return !productionRepository.existsById(productionId);
    }

    public boolean deleteAllProductions(String plotId){
        return productionRepository.deleteByPlotId(plotId);
    }

    @Override
    public List<Production> getPlotProductions(String plotId) {
        return productionRepository.findByPlotId(plotId);
    }
}
