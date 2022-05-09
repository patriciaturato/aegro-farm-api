package com.aegro.farm.controller;

import com.aegro.farm.entity.Plot;
import com.aegro.farm.service.implementation.PlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/farm/{farmId}")
public class PlotController {
    @Autowired
    private PlotServiceImpl plotService;

    @PostMapping("/plot")
    public ResponseEntity<Plot> createPlot(@RequestBody Plot plot){
        Plot createdPlot = plotService.createPlot(plot);
        return new ResponseEntity<>(createdPlot, HttpStatus.CREATED);
    }

    @PutMapping("/plot/{plotId}")
    public ResponseEntity<Plot> updatePlot(@PathVariable("plotId") String id, @RequestBody Plot plot){
        Plot updatedPlot = plotService.updatePlot(id, plot);
        return new ResponseEntity<>(updatedPlot, HttpStatus.OK);
    }

    @DeleteMapping("/plot/{plotId}")
    public ResponseEntity deletePlot(@PathVariable("plotId") String id){
        boolean isDeleted = plotService.deletePlot(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
