package com.septa.ECommerce.controller;

import com.septa.ECommerce.dto.OrderDto;
import com.septa.ECommerce.services.OrderServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    private final OrderServices orderServices;

    public OrderController(OrderServices orderServices){
        this.orderServices = orderServices;
    }

    @PostMapping(value = "/order/create")
    public Object createOrder(@RequestBody OrderDto orderDto) {
        return orderServices.createOrder(orderDto);
    }

    @GetMapping("")
    public Object GetAllOrder() {
        return orderServices.GetAllOrder();
    }

    @GetMapping("/get/{id}")
    public Object GetOrderId(@PathVariable long id) {
        return orderServices.GetOrderById(id);
    }



























}
