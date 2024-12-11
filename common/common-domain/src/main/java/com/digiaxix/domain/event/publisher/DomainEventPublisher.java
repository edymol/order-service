package com.digiaxix.domain.event.publisher;

import com.digiaxix.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}

