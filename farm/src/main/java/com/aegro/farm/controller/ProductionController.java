package com.aegro.farm.controller;

import com.aegro.farm.entity.Production;
import com.aegro.farm.service.ProductionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/farms/{farmId}/plots/{plotId}/production")
public class ProductionController {

    @Autowired
    private ProductionServiceImpl productionService;

    @PostMapping
    public ResponseEntity<Production> create(@RequestBody Production production){
        Production createdProduction = productionService.create(production);
        return new ResponseEntity<Production>(createdProduction, HttpStatus.CREATED);
    }

    @PutMapping("/{productionId}")
    public ResponseEntity<Production> update(@PathVariable("productionId") String id, @RequestBody Production production){
        Production updatedProduction = productionService.update(id, production);
        return new ResponseEntity<Production>(updatedProduction, HttpStatus.OK);
    }

    @DeleteMapping("/{productionId}")
    public ResponseEntity<Production> delete(@PathVariable("productionId") String id){
        boolean isDeleted = productionService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
