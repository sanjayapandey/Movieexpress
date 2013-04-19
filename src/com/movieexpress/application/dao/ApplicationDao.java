package com.movieexpress.application.dao;

import java.util.List;

import com.movieexpress.application.dto.Movie;
import com.movieexpress.auth.dto.User;


public interface ApplicationDao {
	public List<Movie> getMovies( int number ) throws Exception;

//    public List getContacts(User user, String search) throws Exception;

//    void addContact(Contact contact) throws Exception;
//
//    Contact getContact(Integer contactId, User user) throws Exception;
//
//    void updateContact(Contact contact, User user)throws Exception;
//
//    void deleteContact(Contact contact, User user) throws Exception;
}