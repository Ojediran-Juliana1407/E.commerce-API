package com.septa.ECommerce.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor @Data
@Table(name = "'order'")
public class Order {


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customerId",nullable = false)
    private Long customerId;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "id",name = "customerId")
    private Customer customer;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime orderDate;

    @Column(name = "totalAmount")
    private Double totalAmount;

    @Column(name = "orderItems")
    private List<OrderItem> orderItems;
}
