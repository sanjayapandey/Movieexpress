package com.movieexpress.application.dto;

import java.util.Date;

public class Movie {
	int id;
	String title;
	String description;
	String small_image;
	String large_image;
	Date release_date;
	int trailer_id;
	int rate_id;


    public Movie() {

    }

    public Movie(int id, String title , String description , String small_image , 
    		String large_image, Date release_date , int trailer_id , int rate_id) {
        this.id = id;
        this.description = description;
        this.small_image = small_image;
        this.large_image = large_image;
        this.release_date = release_date;
        this.trailer_id = trailer_id;
        this.rate_id = rate_id;

    }

//    public String toString() {
//
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("\n----------------------------------------------------------------------------------------------\n");
//        stringBuilder.append("Id: " + id);
//        stringBuilder.append("\tName: " + firstName + ' ' + middleName + ' ' + lastName);
//        stringBuilder.append("\tPhone: " + phone);
//        stringBuilder.append("\tAddress: " + address);
//        stringBuilder.append("\n----------------------------------------------------------------------------------------------\n");
//
//        return stringBuilder.toString();
//
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSmall_image() {
		return small_image;
	}

	public void setSmall_image(String small_image) {
		this.small_image = small_image;
	}

	public String getLarge_image() {
		return large_image;
	}

	public void setLarge_image(String large_image) {
		this.large_image = large_image;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public int getTrailer_id() {
		return trailer_id;
	}

	public void setTrailer_id(int trailer_id) {
		this.trailer_id = trailer_id;
	}

	public int getRate_id() {
		return rate_id;
	}

	public void setRate_id(int rate_id) {
		this.rate_id = rate_id;
	}

    
}