package com.hello.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hello.model.Fruit;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, String> {
  Fruit findFruitById(String id);
}
