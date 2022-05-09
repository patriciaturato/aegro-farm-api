package com.aegro.farm.controller;

import com.aegro.farm.entity.Farm;
import com.aegro.farm.service.implementation.FarmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class FarmController {

    @Autowired
    private FarmServiceImpl farmService;

    @PostMapping("/farm")
    public ResponseEntity<Farm> createFarm(@RequestBody Farm farm){
        if(farmService.isValid(farm)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Farm createdFarm = farmService.createFarm(farm);
        return new ResponseEntity<>(createdFarm, HttpStatus.CREATED);
    }
    @PutMapping("/farm/{id}")
    public ResponseEntity<Farm> updateFarm(@PathVariable("id") String id, @RequestBody Farm farm){
        Farm updatedFarm = farmService.updateFarm(id, farm);
        return new ResponseEntity<>(updatedFarm, HttpStatus.OK);
    }

    @DeleteMapping("/farm/{id}")
    public ResponseEntity deleteFarm(@PathVariable("id") String id){
        boolean isDeleted = farmService.deleteFarm(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
