package com.michaeldevsjb.dscommerce.repositories;

import com.michaeldevsjb.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
