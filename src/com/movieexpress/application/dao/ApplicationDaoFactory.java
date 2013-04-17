package com.movieexpress.application.dao;

import com.movieexpress.application.dao.myql.ApplicationDaoMysqlImpl;

public class ApplicationDaoFactory {
    public static ApplicationDao getAppDao() throws Exception{
        return new ApplicationDaoMysqlImpl();
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