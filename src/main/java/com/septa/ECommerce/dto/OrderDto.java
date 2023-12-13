package com.septa.ECommerce.dto;

public class OrderDto {
    private long customerId;
    private long orderDate;
    private int totalAmount;
    private int orderItems;

    public OrderDto() {

    }

    public OrderDto(long customerId,long orderDate, int totalAmount, int orderItems){
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(int orderItems) {
        this.orderItems = orderItems;
    }
    @Override
    public String toString() {
        return "OrderDto{" +
                "customerId='" + customerId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", orderItems='" + orderItems + '\'' +
                '}';
    }
}
