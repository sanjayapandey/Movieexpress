package com.movieexpress.application.dao;

import java.util.List;

import com.movieexpress.auth.dto.User;


public interface ApplicationDao {
    public List getContacts(User user, String search) throws Exception;

//    void addContact(Contact contact) throws Exception;
//
//    Contact getContact(Integer contactId, User user) throws Exception;
//
//    void updateContact(Contact contact, User user)throws Exception;
//
//    void deleteContact(Contact contact, User user) throws Exception;
}