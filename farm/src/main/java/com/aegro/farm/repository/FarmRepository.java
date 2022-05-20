package com.aegro.farm.repository;

import com.aegro.farm.entity.Farm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends MongoRepository<Farm, String> {
    @Query("{ 'farmId' : ?0 }")
    Farm findFarmById(String farmId);
}
