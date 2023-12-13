package com.septa.ECommerce.repository;

import com.septa.ECommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
