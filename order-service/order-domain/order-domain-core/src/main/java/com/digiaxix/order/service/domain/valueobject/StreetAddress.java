package com.digiaxix.order.service.domain.valueobject;

import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String city;
    private final String postalCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return street.equals(that.street) && postalCode.equals(that.postalCode) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postalCode);
    }
}
