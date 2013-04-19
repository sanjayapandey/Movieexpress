package com.movieexpress.auth.dto;

public class User{
    int id;
    String firstName;
  //  String middleName;
    String lastName;
    String userName;
    String password;
    //int userId;


    public User() {

    }

    public User(int id, String firstName,  String lastName, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;


    }

    public String toString() {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----------------------------------------------------------------------------------------------\n");
        stringBuilder.append("Id: " + id);
        stringBuilder.append("\tName: " + firstName +" "+ lastName);
        stringBuilder.append("\tUserName: " + userName);
        stringBuilder.append("\tPassword: " + password);
        stringBuilder.append("\n----------------------------------------------------------------------------------------------\n");

        return stringBuilder.toString();

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


   
}