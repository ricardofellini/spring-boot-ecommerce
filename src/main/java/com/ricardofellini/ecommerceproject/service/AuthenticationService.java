package com.ricardofellini.ecommerceproject.service;

import com.ricardofellini.ecommerceproject.config.MessageStrings;
import com.ricardofellini.ecommerceproject.exceptions.AuthenticationFailException;
import com.ricardofellini.ecommerceproject.model.AuthenticationToken;
import com.ricardofellini.ecommerceproject.model.User;
import com.ricardofellini.ecommerceproject.repository.TokenRepository;
import com.ricardofellini.ecommerceproject.utils.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    TokenRepository tokenRepository;

    public void saveConfirmationToken(AuthenticationToken authenticationToken){
        tokenRepository.save(authenticationToken);
    }

    public AuthenticationToken getToken(User user){
        return tokenRepository.findTokenByUser(user);
    }

    public User getUser(String token){
        AuthenticationToken authenticationToken = tokenRepository.findTokenByToken(token);
        if(Helper.notNull(authenticationToken)){
            if(Helper.notNull(authenticationToken.getUser())){
                return authenticationToken.getUser();
            }
        }
        return null;
    }

    public void authenticate(String token) throws AuthenticationFailException {
        if (!Helper.notNull(token)) {
            throw new AuthenticationFailException(MessageStrings.AUTH_TOKEN_NOT_PRESENT);
        }
        if (!Helper.notNull(getUser(token))) {
            throw new AuthenticationFailException(MessageStrings.AUTH_TOKEN_NOT_VALID);
        }
    }


}
