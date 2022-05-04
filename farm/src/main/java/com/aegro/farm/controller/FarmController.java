package com.aegro.farm.controller;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/farms")
public class FarmController {
    @Autowired
    private FarmService farmService;

    @PostMapping
    public ResponseEntity<Farm> createFarm(@RequestBody Farm farm){
        Farm createdFarm = farmService.create(farm);
        return new ResponseEntity<Farm>(createdFarm, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Farm> updateFarm(@PathVariable("id") String id, @RequestBody Farm farm){
        Farm updatedFarm = farmService.update(id, farm);
        return new ResponseEntity<Farm>(updatedFarm, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Farm> deleteFarm(@PathVariable("id") String id){
        boolean isDeleted = farmService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
