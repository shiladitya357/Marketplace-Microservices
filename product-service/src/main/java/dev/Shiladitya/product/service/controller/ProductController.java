package dev.Shiladitya.product.service.controller;

import dev.Shiladitya.product.service.dto.ProductRequest;
import dev.Shiladitya.product.service.dto.ProductResponse;
import dev.Shiladitya.product.service.service.ProductService;
import dev.Shiladitya.product.service.util.ProductServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ProductServiceUtil.API_URI_PRODUCTS)
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
