package com.moiveexpress.common;

import com.movieexpress.auth.dao.AuthDao;
import com.movieexpress.auth.dao.AuthDaoFactory;

public class Util{

public static boolean validateSignUp(String firstName, String lastName, String userName, String password, String rePassword){   
		boolean valid=true;
		try {
		AuthDao dao = AuthDaoFactory.getAuthDao();
		valid = valid && !firstName.trim().isEmpty();
		valid = valid && !lastName.trim().isEmpty();
		valid = valid && password.equals(rePassword);
		valid = valid && (!dao.existsUsername(userName));
		System.out.println(valid);
		}catch (Exception e) {
// TODO Auto-generated catch block
		valid = false;
		e.printStackTrace();
		}
			return valid;
	}
}
