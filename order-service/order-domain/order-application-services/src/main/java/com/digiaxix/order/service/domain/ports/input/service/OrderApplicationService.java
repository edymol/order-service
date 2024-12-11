package com.digiaxix.order.service.domain.ports.input.service;

import com.digiaxix.order.service.domain.dto.create.CreateOrderCommand;
import com.digiaxix.order.service.domain.dto.track.TrackOrderQuery;
import com.digiaxix.order.service.domain.dto.track.TrackOrderResponse;
import jakarta.validation.Valid;

public interface OrderApplicationService {
    CreateOrderCommand createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid  TrackOrderQuery trackOrderQuery);
}