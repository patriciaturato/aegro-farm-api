package com.aegro.farm.entity;

import java.math.BigDecimal;
import java.util.List;

public class Farm {
    private String name;
    private List<Plot> plots;
    private BigDecimal productivity;

    public Farm() {
    }

    public Farm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlot(Plot plot){
        this.plots.add(plot);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", plots=" + plots +
                ", productivity=" + productivity +
                '}';
    }
}
