package com.digiaxix.order.service.domain.entity;

import com.digiaxix.domain.entity.BaseEntity;
import com.digiaxix.domain.valueobject.Money;
import com.digiaxix.domain.valueobject.ProductId;
import lombok.*;

@Getter
public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

}
