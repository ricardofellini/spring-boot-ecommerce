package com.ricardofellini.ecommerceproject.repository;

import com.ricardofellini.ecommerceproject.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
