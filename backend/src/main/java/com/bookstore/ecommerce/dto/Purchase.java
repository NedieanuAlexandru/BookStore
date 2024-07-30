package com.bookstore.ecommerce.dto;

import com.bookstore.ecommerce.entity.Address;
import com.bookstore.ecommerce.entity.Customer;
import com.bookstore.ecommerce.entity.Order;
import com.bookstore.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
