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
    private FarmService farmService;

    @PostMapping
    public ResponseEntity<Farm> createFarm(@RequestBody Farm farm){
        Farm createdFarm = farmService.create(farm);
        return new ResponseEntity(createdFarm, HttpStatus.CREATED);
    }

}
