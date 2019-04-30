package com.springdemo.mvc;

import javax.validation.constraints.Size;

import com.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1)
    private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="must greater than or equal to zero")
	@Max(value=10,message="must less than or equal to zero")
	private Integer freePasses;


    public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 digits/chars")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
    	return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName= firstName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName= lastName;
    }
    
    public String getLastName() {
    	return lastName;
    }
}
