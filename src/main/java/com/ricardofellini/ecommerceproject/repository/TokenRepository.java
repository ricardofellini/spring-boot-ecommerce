package com.ricardofellini.ecommerceproject.repository;

import com.ricardofellini.ecommerceproject.model.AuthenticationToken;
import com.ricardofellini.ecommerceproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<AuthenticationToken, Long> {

    AuthenticationToken findTokenByUser(User user);
    AuthenticationToken findTokenByToken(String token);

}
