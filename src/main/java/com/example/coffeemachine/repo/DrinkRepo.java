package com.example.coffeemachine.repo;

import com.example.coffeemachine.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepo extends JpaRepository<Drink, Long> {
}
