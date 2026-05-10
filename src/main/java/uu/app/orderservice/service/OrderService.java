package uu.app.orderservice.service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import uu.app.orderservice.dto.UserDto;
import uu.app.orderservice.entity.OrderEntity;
import uu.app.orderservice.repository.OrderRepository;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final UserClient userClient;

    public OrderEntity createOrder(OrderEntity order, HttpHeaders headers) {
        UserDto user = userClient.getUser(order.getUserId(), headers);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return repository.save(order);
    }
}
