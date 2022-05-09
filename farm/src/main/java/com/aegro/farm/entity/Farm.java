package com.aegro.farm.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Document(collection = "Farm")
public class Farm {
    @Id
    private String id;
    private String name;
    private BigDecimal productivity;

    public Farm() {
    }

    public Farm(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Farm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", productivity=" + productivity +
                '}';
    }
}
