package com.digiaxix.order.service.domain.entity;

import com.digiaxix.domain.entity.BaseEntity;
import com.digiaxix.domain.valueobject.Money;
import com.digiaxix.domain.valueobject.OrderId;
import com.digiaxix.order.service.domain.valueobject.OrderItemId;
import lombok.Getter;
import lombok.Setter;

public class OrderItem extends BaseEntity<OrderItemId> {
    @Setter
    @Getter
    private OrderId orderId;
    private final Product product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    private OrderItem(Builder builder) {
        product = builder.product;
        quantity = builder.quantity;
        price = builder.price;
        subTotal = builder.subTotal;
    }

    public static final class Builder {
        private Product product;
        private int quantity;
        private Money price;
        private Money subTotal;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder product(Product val) {
            product = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Builder subTotal(Money val) {
            subTotal = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
