package com.movieexpress.application.dao.myql;

import java.util.List;

import com.movieexpress.application.dao.ApplicationDao;
import com.movieexpress.auth.dto.User;

public class ApplicationDaoMysqlImpl implements ApplicationDao {

	@Override
	public List getContacts(User user, String search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

//    public List getContacts(User user, String search) throws Exception {
//        if(search!= null && search.length()>0){
//            return new HomeDaoMysql().searchContacts(user,search);
//
//        }else {
//            return new HomeDaoMysql().getContacts(user);
//        }
//    }
//
//    @Override
//    public void addContact(Contact contact) throws Exception {
//        new ContactDaoMysql().addContact(contact);
//    }
//
//    @Override
//    public Contact getContact(Integer contactId, User user) throws Exception {
//
//        return new ContactDaoMysql().getContact(contactId,user);
//    }
//
//    @Override
//    public void updateContact(Contact contact, User user) throws Exception {
//        new ContactDaoMysql().updateContact(contact,user);
//    }
//
//    @Override
//    public void deleteContact(Contact contact, User user) throws Exception {
//        new ContactDaoMysql().deleteContact(contact,user);
//
//    }


}