package com.aegro.farm.service;

import com.aegro.farm.entity.Plot;

import java.util.List;

public interface PlotService {
    Plot createPlot(Plot plot);
    Plot updatePlot(String plotId, Plot plot);
    boolean deletePlot(String plotId);
    boolean deleteFarmPlots(String farmId);
    Plot getPlot(String plotId);
    List<Plot> getFarmPlots(String farmId);
}
