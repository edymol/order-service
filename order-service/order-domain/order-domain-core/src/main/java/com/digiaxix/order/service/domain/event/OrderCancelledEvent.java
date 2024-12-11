package com.digiaxix.order.service.domain.event;

import com.digiaxix.domain.event.DomainEvent;
import com.digiaxix.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {

    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
