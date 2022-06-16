package com.kunal.FindCollege.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
@Entity
@Table(name="College")
public class College {
	
	
	public College() {
		super();
	}

	public College(
			String collegeId,
			String collegePassword,
			String collegeName,
			String collegeEmail,
			String collegeCity,
			String collegeCountry,
			Long collegeRank,
			String url,
			String phoneNumber,
		    String aadharNumber) {
		super();
		this.collegeId = collegeId;
		this.collegePassword = collegePassword;
		this.collegeName = collegeName;
		this.collegeEmail = collegeEmail;
		this.collegeCity = collegeCity;
		this.collegeCountry = collegeCountry;
		this.collegeRank = collegeRank;
		this.url = url;
		this.phoneNumber = phoneNumber;
		this.aadharNumber = aadharNumber;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegePassword=" + collegePassword + ", collegeName="
				+ collegeName + ", collegeEmail=" + collegeEmail + ", collegeCity=" + collegeCity + ", collegeCountry="
				+ collegeCountry + ", collegeRank=" + collegeRank + ", url=" + url + ", phoneNumber=" + phoneNumber
				+ ", aadharNumber=" + aadharNumber + "]";
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegePassword() {
		return collegePassword;
	}

	public void setCollegePassword(String collegePassword) {
		this.collegePassword = collegePassword;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}

	public String getCollegeCity() {
		return collegeCity;
	}

	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

	public String getCollegeCountry() {
		return collegeCountry;
	}

	public void setCollegeCountry(String collegeCountry) {
		this.collegeCountry = collegeCountry;
	}

	public Long getCollegeRank() {
		return collegeRank;
	}

	public void setCollegeRank(Long collegeRank) {
		this.collegeRank = collegeRank;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	@Id
	@NotEmpty
	@Column(length=6)
	@Size(min=6,message="Id length should be of 6 characters")
	private String collegeId;
	
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{6,8}$",message="Please enter password in correct format")
	private String collegePassword;
	
	@Size(min=2,max=20,message="Name should be in between 2 - 20 characters")
	private String collegeName;
	
	@NotEmpty
	@Email
	@Pattern(regexp="^[A-Za-z0-9]+@(.+)$",message="Please enter valid Email Id")
	private String collegeEmail;
	
	@NotNull
	private String collegeCity;
	
	@Length(min=4,max=20,message="Country name should be in between 4 to 20 characters")
	private String collegeCountry;
	
	@Range(min=1,max=100,message="College Rank should be in between 1 and 100")
	private Long collegeRank;
	
	@URL
	private String url;
	
	@Pattern(regexp="^[6-9]{1}[0-9]{3}[0-9]{3}[0-9]{3}$",message="Please enter valid phone number")
	private String phoneNumber;
	
	@Pattern(regexp="^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$",message="Please enter valid aadhar number")
	private String aadharNumber;
	
	

}