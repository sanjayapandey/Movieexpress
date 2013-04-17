package com.movieexpress.auth.dao;

import com.movieexpress.auth.dao.mysql.AuthDaoMysqlImpl;

public class AuthDaoFactory {
	public static AuthDao getAuthDao() throws Exception{
        return new AuthDaoMysqlImpl();
//        if("MYSQL".equalsIgnoreCase("")){
//            return new AuthDaoMysqlImpl();
//        }else if("ORACLE".equalsIgnoreCase("")){
//            return null;
//
//        }else{
//            throw new Exception("DAMN!!!Invalid Database Server :(");
//        }
    }
}