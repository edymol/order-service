package com.digiaxix.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErroDTO {

    private final String code;
    private final String message;
}
