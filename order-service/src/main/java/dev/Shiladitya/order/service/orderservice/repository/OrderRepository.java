package dev.Shiladitya.order.service.orderservice.repository;

import dev.Shiladitya.order.service.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
