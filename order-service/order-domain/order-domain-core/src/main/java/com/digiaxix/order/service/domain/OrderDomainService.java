package com.digiaxix.order.service.domain;

import com.digiaxix.order.service.domain.entity.Order;
import com.digiaxix.order.service.domain.entity.Restaurant;
import com.digiaxix.order.service.domain.event.OrderCancelledEvent;
import com.digiaxix.order.service.domain.event.OrderCreateEvent;
import com.digiaxix.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {
    OrderCreateEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessage);

    void cancelOrder(Order order, List<String> failureMessage);
}
