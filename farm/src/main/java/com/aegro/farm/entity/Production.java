package com.aegro.farm.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Document(collection = "Production")
public class Production {

    @Id
    private String id;
    private BigDecimal production;
    private String plotId;

    public Production() {
    }

    public Production(BigDecimal production) {
        this.production = production;
    }

    public Production(String id, BigDecimal production) {
        this.id = id;
        this.production = production;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getProduction() {
        return production;
    }

    public String getPlotId() {
        return plotId;
    }

    public void setPlotId(String plotId) {
        this.plotId = plotId;
    }

    public void setProduction(BigDecimal production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Production{" +
                "id='" + id + '\'' +
                ", production=" + production +
                ", plotId='" + plotId + '\'' +
                '}';
    }
}
