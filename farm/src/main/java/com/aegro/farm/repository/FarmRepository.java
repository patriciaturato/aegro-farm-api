package com.aegro.farm.repository;

import com.aegro.farm.entity.Farm;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FarmRepository extends MongoRepository<Farm, String> {
}
