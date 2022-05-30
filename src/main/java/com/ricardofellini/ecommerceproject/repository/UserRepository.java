package com.ricardofellini.ecommerceproject.repository;


import com.ricardofellini.ecommerceproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User findByEmail(String email);

    User findUserByEmail(String email);
}
