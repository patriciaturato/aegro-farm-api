package com.aegro.farm.service;

import com.aegro.farm.entity.Plot;
import com.aegro.farm.repository.PlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlotServiceImpl implements PlotService{

    @Autowired
    public PlotRepository plotRepository;

    public PlotServiceImpl() {
    }

    @Override
    public Plot create(Plot plot) {
        return plotRepository.insert(plot);
    }

    @Override
    public Plot update(String id, Plot plot) {
        plot.setId(id);
        return plotRepository.save(plot);
    }

    @Override
    public boolean delete(String id) {
        plotRepository.deleteById(id);
        return !plotRepository.existsById(id);
    }
}
