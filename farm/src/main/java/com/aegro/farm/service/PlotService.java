package com.aegro.farm.service;

import com.aegro.farm.entity.Plot;

public interface PlotService {
    Plot createPlot(Plot plot);
    Plot updatePlot(String id, Plot plot);
    boolean deletePlot(String plotId);
    boolean deleteFarmPlots(String farmId);
}
