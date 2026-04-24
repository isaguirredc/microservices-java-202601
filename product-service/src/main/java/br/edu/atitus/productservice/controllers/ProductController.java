package br.edu.atitus.productservice.controllers;

import br.edu.atitus.productservice.dtos.ProductDTO;
import br.edu.atitus.productservice.entities.ProductEntity;
import br.edu.atitus.productservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private Environment environment;

    @GetMapping("/{idproduct}")
    public ProductDTO getProduct(
            @PathVariable Long idproduct,
            @RequestParam String targetCurrency
    ) {
        Optional<ProductEntity> productOpt = repository.findById(idproduct);

        if (productOpt.isEmpty()) {
            throw new RuntimeException("Product not found");
        }

        ProductEntity product = productOpt.get();

        String port = environment.getProperty("local.server.port");

        return new ProductDTO(
                product.getId(),
                product.getDescription(),
                product.getBrand(),
                product.getModel(),
                product.getPrice(),
                product.getCurrency(),
                product.getStock(),
                "Product-service running on Port: " + port,
                null,
                targetCurrency
        );
    }
}