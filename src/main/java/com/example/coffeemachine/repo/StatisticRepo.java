package com.example.coffeemachine.repo;

import com.example.coffeemachine.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepo extends JpaRepository<Statistic, Long> {
}
