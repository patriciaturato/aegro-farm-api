package com.aegro.farm.repository;

import com.aegro.farm.entity.Plot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlotRepository extends MongoRepository<Plot, String> {
}
