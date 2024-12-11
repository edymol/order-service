package com.digiaxix.order.service.domain.dto.create;

import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import jakarta.validation.constraints.NotNull;

@Builder
@Getter
@AllArgsConstructor
public class OrderAddress {
    @NotNull
    @Max(value = 50)
    private String street;
    @NotNull
    @Max(value = 10)
    private String postalCode;
    @NotNull
    @Max(value = 50)
    private String city;
}
