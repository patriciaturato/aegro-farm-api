package com.aegro.farm.controller;

import com.aegro.farm.entity.Plot;
import com.aegro.farm.service.PlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/farms/{farmId}/plots")
public class PlotController {
    @Autowired
    private PlotServiceImpl plotService;

    @PostMapping
    public ResponseEntity<Plot> createPlot(@RequestBody Plot plot){
        Plot createdPlot = plotService.create(plot);
        return new ResponseEntity<Plot>(createdPlot, HttpStatus.CREATED);
    }

    @PutMapping("/{plotId}")
    public ResponseEntity<Plot> updatePlot(@PathVariable("plotId") String id, @RequestBody Plot plot){
        Plot updatedPlot = plotService.update(id, plot);
        return new ResponseEntity<Plot>(updatedPlot, HttpStatus.OK);
    }

    @DeleteMapping("/{plotId}")
    public ResponseEntity<Plot> deletePlot(@PathVariable("plotId") String id){
        boolean isDeleted = plotService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
