package com.aegro.farm.controller;

import com.aegro.farm.entity.Production;
import com.aegro.farm.service.implementation.ProductionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/farm/{farmId}/plot/{plotId}")
public class ProductionController {

    @Autowired
    private ProductionServiceImpl productionService;

    @PostMapping("/production")
    public ResponseEntity<Production> create(@RequestBody Production production){
        Production createdProduction = productionService.createProduction(production);
        return new ResponseEntity<>(createdProduction, HttpStatus.CREATED);
    }

    @PutMapping("/production/{productionId}")
    public ResponseEntity<Production> update(@PathVariable("productionId") String id, @RequestBody Production production){
        Production updatedProduction = productionService.updateProduction(id, production);
        return new ResponseEntity<>(updatedProduction, HttpStatus.OK);
    }

    @DeleteMapping("/production/{productionId}")
    public ResponseEntity delete(@PathVariable("productionId") String id){
        boolean isDeleted = productionService.deleteProduction(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
