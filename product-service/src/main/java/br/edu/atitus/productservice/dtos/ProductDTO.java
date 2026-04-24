package br.edu.atitus.productservice.dtos;

public record ProductDTO(
        Long id,
        String description,
        String brand,
        String model,
        Double currency,
        String price,
        Integer stock,
        String environment,
        Double convertedPrice,
        String requestedCurrency
) {}