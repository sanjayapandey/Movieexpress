package com.movieexpress.auth.dao;

import com.movieexpress.auth.dto.User;

public interface AuthDao {

    User login(String username, String password) throws Exception;

    void setRememberToken(User user, String cookieToken) throws Exception;

    User getUserFromAuthToken(String authToken) throws Exception;

    User signup(String firstname,String lastname, String username, String password) throws Exception;

    Boolean existsUsername(String username) throws Exception;

}