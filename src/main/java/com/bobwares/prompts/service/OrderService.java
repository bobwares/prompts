package com.bobwares.prompts.service;

import com.bobwares.prompts.entity.Order;
import com.bobwares.prompts.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(String id, Order order) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            existingOrder.setCustomerId(order.getCustomerId());
            existingOrder.setProductId(order.getProductId());
            existingOrder.setQuantity(order.getQuantity());
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}