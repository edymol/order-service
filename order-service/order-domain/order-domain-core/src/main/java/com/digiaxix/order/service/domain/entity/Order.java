package com.digiaxix.order.service.domain.entity;

import com.digiaxix.domain.entity.AggregateRoot;
import com.digiaxix.domain.valueobject.*;
import com.digiaxix.order.service.domain.valueobject.StreetAddress;
import lombok.Data;

import java.util.List;
@Data
public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final RestaurantId restaurantId;
    private final StreetAddress deliveryAddress;
    private final Money price;
    private final List<OrderItem> items;

}
