package uu.app.orderservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import uu.app.orderservice.entity.OrderEntity;
import uu.app.orderservice.service.OrderService;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity order, @RequestHeader HttpHeaders headers) {
        return orderService.createOrder(order, headers);
    }

}
