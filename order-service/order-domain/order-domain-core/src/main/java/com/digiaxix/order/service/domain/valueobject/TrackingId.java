package com.digiaxix.order.service.domain.valueobject;

import com.digiaxix.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
