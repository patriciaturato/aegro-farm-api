package com.aegro.farm.service.implementation;

import com.aegro.farm.entity.Plot;
import com.aegro.farm.repository.PlotRepository;
import com.aegro.farm.service.PlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlotServiceImpl implements PlotService {

    @Autowired
    public PlotRepository plotRepository;
    @Autowired
    public ProductionServiceImpl productionService;

    public PlotServiceImpl() {
    }

    @Override
    public Plot createPlot(Plot plot) {
        return plotRepository.insert(plot);
    }

    @Override
    public Plot updatePlot(String plotId, Plot plot) {
        plot.setId(plotId);
        return plotRepository.save(plot);
    }

    @Override
    public boolean deletePlot(String plotId) {
        productionService.deleteAllProductions(plotId);
        plotRepository.deleteById(plotId);
        return !plotRepository.existsById(plotId);
    }

    @Override
    public boolean deleteFarmPlots(String farmId) {
        List<Plot> plotsToDelete = plotRepository.findByFarmId(farmId);
        plotsToDelete.forEach(plot -> deletePlot(plot.getId()));
        return true; /*need to verify if all plots with farmId were deleted from the database*/
    }

    @Override
    public Plot getPlot(String plotId){
        return plotRepository.findPlotById(plotId);
    }

    @Override
    public List<Plot> getFarmPlots(String farmId) {
        return plotRepository.findByFarmId(farmId);
    }
}
