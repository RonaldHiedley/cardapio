package com.example.cardapio.Food;

import org.apache.catalina.realm.JAASCallbackHandler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
