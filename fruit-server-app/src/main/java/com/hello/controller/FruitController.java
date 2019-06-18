package com.hello.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.Fruit;
import com.hello.services.FruitService;

@CrossOrigin
@RestController
@RequestMapping("/fruits")
public class FruitController {

  private FruitService fruitService;

  public FruitController(final FruitService fruitService) {
    this.fruitService = fruitService;
  }

  @GetMapping
  public List<Fruit> getAllFruits() {
    List<Fruit> fruits = fruitService.getAllFruits();
    return fruits;
  }

  @PostMapping
  public void saveFruit(@RequestBody Fruit fruit) {
    fruitService.saveFruit(fruit);
  }

  @PutMapping("/{fruitId}")
  public void updateFruit(@PathVariable(value = "fruitId") final String id, @Valid @RequestBody Fruit fruit) {
    fruitService.updateFruit(fruit, id);
  }

  @DeleteMapping("/deleteFruits")
  public void deleteFruit(@RequestBody List<Fruit> fruits) {
    fruitService.deleteFruits(fruits);
  }

  @GetMapping("/{id}")
  public Fruit getFruitById(@PathVariable("id") final String id) {
    Fruit fruit = fruitService.getFruitById(id);
    return fruit;
  }
}
