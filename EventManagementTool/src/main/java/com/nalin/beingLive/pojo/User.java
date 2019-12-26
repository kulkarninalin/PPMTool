package com.nalin.beingLive.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NotBlank(message = "First name reqiured")
	private String first_name;
	private String middle_name;
	@NotBlank(message = "Last name is required")
	private String last_name;
	private String role;
	
	@NotBlank(message = "mobile required")
	@Size(min=4,max=10,message = "between 4 to 10")
	@Column(updatable = false,unique = true)
	private String mobile_number;
	private Long alternate_number;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date birthDate;
	private int age;
	private String primary_skill;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date start_Date;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date end_Date;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date created_At;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date updated_At;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Long id, String first_name, String middle_name, String last_name, String role, String mobile_number,
			Long alternate_number, Date birthDate, int age, String primary_skill, Date start_Date, Date end_Date,
			Date created_At, Date updated_At) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.role = role;
		this.mobile_number = mobile_number;
		this.alternate_number = alternate_number;
		this.birthDate = birthDate;
		this.age = age;
		this.primary_skill = primary_skill;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
		this.created_At = created_At;
		this.updated_At = updated_At;
	}

	@PrePersist
	public void onCreate() {
		this.created_At = new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updated_At = new Date();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Long getAlternate_number() {
		return alternate_number;
	}

	public void setAlternate_number(Long alternate_number) {
		this.alternate_number = alternate_number;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrimary_skill() {
		return primary_skill;
	}

	public void setPrimary_skill(String primary_skill) {
		this.primary_skill = primary_skill;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", middle_name=" + middle_name + ", last_name="
				+ last_name + ", role=" + role + ", mobile_number=" + mobile_number + ", alternate_number="
				+ alternate_number + ", birthDate=" + birthDate + ", age=" + age + ", primary_skill=" + primary_skill
				+ ", start_Date=" + start_Date + ", end_Date=" + end_Date + ", created_At=" + created_At
				+ ", updated_At=" + updated_At + "]";
	}
	
	
	

}
