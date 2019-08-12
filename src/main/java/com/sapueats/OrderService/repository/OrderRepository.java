package com.sapueats.OrderService.repository;

import com.sapueats.OrderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableJpaRepositories
public interface OrderRepository extends JpaRepository<Order, String> {
}
