package br.edu.atitus.productservice.dtos;

public record ProductDTO(
        Long id,
        String description,
        String brand,
        String model,
<<<<<<< HEAD
        Double currency,
        String price,
        Integer stock,
        String environment,
        Double convertedPrice,
        String requestedCurrency
) {}
=======
        String currency,
        Double price,
        Integer stock,
        Double convertedPrice,
        String environment,
        String requestCurrency
) {
}
>>>>>>> 63fd536 (última atualização)
