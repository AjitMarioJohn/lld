package com.parking.lot.presentation.rest.api.entities;

import lombok.Builder;
import lombok.Value;
import org.springframework.http.HttpStatus;

@Value
public class ApiResponse<T> {
    HttpStatus status;
    T body;
}
