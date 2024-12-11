package com.digiaxix.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.digiaxix.domain.event.publisher.DomainEventPublisher;
import com.digiaxix.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
