package uu.app.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uu.app.orderservice.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
