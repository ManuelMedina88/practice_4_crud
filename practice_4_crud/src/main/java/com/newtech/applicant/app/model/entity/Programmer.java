package com.newtech.applicant.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="programmers")
public class Programmer implements Serializable{

	private static final long serialVersionUID = -6767759846271783907L;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String nickName;
	
	@NotEmpty
	@Column(name = "main_language")
	private String mainProgrammingLanguage;
	
	@NotEmpty
	private String company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMainProgrammingLanguage() {
		return mainProgrammingLanguage;
	}

	public void setMainProgrammingLanguage(String mainProgrammingLanguage) {
		this.mainProgrammingLanguage = mainProgrammingLanguage;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

		
}
