package com.hello.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hello.model.Fruit;

@Component
public class DbSeeder implements CommandLineRunner {
  private FruitRepository fruitRepository;

  public DbSeeder(FruitRepository fruitRepository) {
    this.fruitRepository = fruitRepository;
  }

  @Override
  public void run(final String... strings) throws Exception {
    Fruit mango = new Fruit("Mango", "Yellow");
    Fruit apple = new Fruit("Apple", "Red");
    Fruit banana = new Fruit("Banana", "Yellow");
    Fruit papaya = new Fruit("Papaya", "Orange");
    Fruit grapes = new Fruit("Grapes", "Green");


    // drop all fruits
    this.fruitRepository.deleteAll();

    // add fruits to DB
    List<Fruit> hotels = Arrays.asList(mango, apple, banana, papaya, grapes);
    this.fruitRepository.saveAll(hotels);
  }
}
