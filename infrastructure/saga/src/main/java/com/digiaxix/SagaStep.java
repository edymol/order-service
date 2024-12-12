package com.digiaxix;

public interface SagaStep<T> {
    void process(T data);
    void rollback(T data);
}
