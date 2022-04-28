package com.aegro.farm.entity;

import java.math.BigDecimal;
import java.util.List;

public class Plot {
    private String id;
    private BigDecimal area;
    private List<BigDecimal> production;
    private BigDecimal productivity;

    public Plot() {
    }

    public Plot(String id, BigDecimal area) {
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public void addProduction(BigDecimal production){
        this.production.add(production);
    }

    public void calculateProductivity() {
        if(this.production.isEmpty()) {
            System.out.println("No production registration: can't calculate productivity");
        }
        this.productivity = this.production.get(this.production.size()-1).divide(getArea());
    }

    public BigDecimal getProductivity(){
        return this.productivity;
    }

    @Override
    public String toString() {
        return "Plot{" +
                "id='" + id + '\'' +
                ", area=" + area +
                ", production=" + production +
                ", productivity=" + productivity +
                '}';
    }
}
