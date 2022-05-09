package com.aegro.farm.repository;

import com.aegro.farm.entity.Plot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlotRepository extends MongoRepository<Plot, String> {
    @Query("{ 'farmId' : ?0 }")
    List<Plot> findByFarmId(String farmId);
}
