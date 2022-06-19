package com.ricardofellini.ecommerceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart>
}
