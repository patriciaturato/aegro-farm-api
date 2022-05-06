package com.aegro.farm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Document(collection = "Plot")
public class Plot {
    @Id
    private String id;
    private BigDecimal area;
    @Autowired
    private List<Production> productions;
    private BigDecimal productivity;

    public Plot() {
    }

    public Plot(String id, BigDecimal area) {
        this.id = id;
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

    public List<Production> getProductions() {
        return productions;
    }

    public void addProduction(Production production){
        this.productions.add(production);
    }

    public BigDecimal getProductivity(){
        return this.productivity;
    }

    public void setProductivity(BigDecimal productivity) {
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "Plot{" +
                "id='" + id + '\'' +
                ", area=" + area +
                ", productions=" + productions +
                ", productivity=" + productivity +
                '}';
    }
}
