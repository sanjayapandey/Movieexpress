package com.movieexpress.auth.dao.mysql;

import com.movieexpress.auth.dao.AuthDao;
import com.movieexpress.auth.dto.User;



public class AuthDaoMysqlImpl implements AuthDao {

    public User login(String username, String password) throws Exception {
        return new AuthDaoMysql().login(username, password);
    }

    @Override
    public void setRememberToken(User user, String cookieToken) throws Exception {
        new AuthDaoMysql().setRememberToken(user, cookieToken);
    }

    @Override
    public User getUserFromAuthToken(String authToken) throws Exception {
        return new AuthDaoMysql().getUserFromAuthToken(authToken);
    }

    @Override
    public User signup(String firstname, String lastname, String username, String password) throws Exception {
        return new AuthDaoMysql().signup(firstname, lastname, username, password);
    }

    @Override
    public Boolean existsUsername(String username) throws Exception {
        return new AuthDaoMysql().existsUsername(username);
    }


}
