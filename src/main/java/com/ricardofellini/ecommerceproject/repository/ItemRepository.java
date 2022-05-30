package com.ricardofellini.ecommerceproject.repository;

import com.ricardofellini.ecommerceproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Product, Long> {
}
