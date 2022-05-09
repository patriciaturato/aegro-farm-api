package com.aegro.farm.repository;

import com.aegro.farm.entity.Production;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionRepository extends MongoRepository<Production, String> {
    @Query("{ 'plotId' : ?0 }")
    List<Production> findByPlotId(String plotId);

    @Query("{ 'plotId' : ?0 }")
    boolean deleteByPlotId(String plotId);
}
