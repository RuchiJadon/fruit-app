package com.hello.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.model.Fruit;
import com.hello.repository.FruitRepository;

@Service
public class FruitService {

  private FruitRepository fruitRepository;

  public FruitService(final FruitRepository fruitRepository) {
    this.fruitRepository = fruitRepository;
  }

  public List<Fruit> getAllFruits() {
    return fruitRepository.findAll();
  }

  public void saveFruit(Fruit fruit) {
    fruitRepository.insert(fruit);
  }

  public void updateFruit(Fruit fruit, String id) {
    fruit.setId(id);
    fruitRepository.save(fruit);
  }

  public void deleteFruits(List<Fruit> fruits) {
    fruitRepository.deleteAll(fruits);
  }

  public Fruit getFruitById(String id) {
    return fruitRepository.findFruitById(id);
  }
}
