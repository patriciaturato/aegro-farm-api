package com.aegro.farm.service;

import com.aegro.farm.entity.Plot;

public interface PlotService {
    Plot create(Plot plot);
    Plot update(String id, Plot plot);
    boolean delete(String plotId);
}
