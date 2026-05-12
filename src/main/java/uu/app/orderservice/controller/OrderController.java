package uu.app.orderservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import uu.app.orderservice.entity.OrderEntity;
import uu.app.orderservice.service.OrderService;

@Slf4j
@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity order, @RequestHeader HttpHeaders headers) {
        log.info("Creating order {}", order);
        return orderService.createOrder(order, headers);
    }

}
