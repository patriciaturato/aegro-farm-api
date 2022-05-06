package com.aegro.farm.service;

import com.aegro.farm.entity.Production;
import com.aegro.farm.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionServiceImpl implements ProductionService{

    @Autowired
    private ProductionRepository productionRepository;

    public ProductionServiceImpl() {
    }

    @Override
    public Production create(Production production) {
        return productionRepository.insert(production);
    }

    @Override
    public Production update(String id, Production production) {
        production.setId(id);
        return productionRepository.save(production);
    }

    @Override
    public boolean delete(String productionId) {
        productionRepository.deleteById(productionId);
        return !productionRepository.existsById(productionId);
    }
}
