package dev.Shiladitya.order.service.orderservice.controller;

import dev.Shiladitya.order.service.orderservice.dto.OrderRequest;
import dev.Shiladitya.order.service.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order placed successfully.";
    }
}
