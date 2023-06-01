package com.hashoon.customer;

public record NewCustomerRequest(
        String name,
        String email,
        Integer age
) {
}
