package com.aegro.farm.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Document(collection = "Plot")
public class Plot {
    @Id
    private String id;
    private BigDecimal area;
    private String farmId;
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

    public String getFarmId() {
        return farmId;
    }

    public void setFarmId(String farmId) {
        this.farmId = farmId;
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
                ", farmId='" + farmId + '\'' +
                ", productivity=" + productivity +
                '}';
    }
}
