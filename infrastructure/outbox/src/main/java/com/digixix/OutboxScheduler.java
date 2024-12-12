package com.digixix;

public interface OutboxScheduler {
    void processOutboxMessage();
}
