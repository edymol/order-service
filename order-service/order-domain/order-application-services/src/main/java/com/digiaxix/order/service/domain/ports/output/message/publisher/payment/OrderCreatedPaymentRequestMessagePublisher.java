package com.digiaxix.order.service.domain.ports.output.message.publisher.payment;

import com.digiaxix.domain.event.publisher.DomainEventPublisher;
import com.digiaxix.order.service.domain.event.OrderCreateEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreateEvent> {
}