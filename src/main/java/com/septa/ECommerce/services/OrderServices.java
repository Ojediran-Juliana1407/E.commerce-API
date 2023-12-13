package com.septa.ECommerce.services;

import com.septa.ECommerce.controller.OrderController;
import com.septa.ECommerce.dto.OrderDto;
import com.septa.ECommerce.model.Order;
import com.septa.ECommerce.repository.OrderRepository;


public class OrderServices {

    private final OrderRepository orderRepository ;

    public OrderServices(OrderServices orderServices){
        this.orderRepository = orderServices.orderRepository;
    }

    public Object createOrder(OrderDto orderDto){
        Order order = new Order();

        order.setCustomerId(orderDto.getCustomerId());
        order.setOrderDate(orderDto.getOrderDate());
        order.setTotalAmount(orderDto.getTotalAmount());
        order.setOrderItems(orderDto.getOrderItems());

        return orderRepository.save(order);
    }
    public Object GetAllOrder(){
        return orderRepository.findAll();
    }

    public Object GetOrderById(long id){
        return orderRepository.findById(id);
    }






















}
