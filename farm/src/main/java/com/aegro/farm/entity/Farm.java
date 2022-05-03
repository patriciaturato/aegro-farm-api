package com.aegro.farm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String id;
    private String name;
    private List<Plot> plots;
    private BigDecimal productivity;

    public Farm() {
        this.plots = new ArrayList<>();
    }

    public Farm(String id, String name) {
        this.id = id;
        this.name = name;
        this.plots = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
