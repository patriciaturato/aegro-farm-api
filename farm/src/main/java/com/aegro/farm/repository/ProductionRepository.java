package com.aegro.farm.repository;

import com.aegro.farm.entity.Production;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository extends MongoRepository<Production, String> {
}