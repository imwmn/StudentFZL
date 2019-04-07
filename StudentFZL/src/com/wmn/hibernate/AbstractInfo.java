package com.wmn.hibernate;

import java.util.Date;

/**
 * AbstractInfo entity provides the base persistence definition of the Info
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInfo implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String sex;
	private String major;
	private Date birth;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractInfo() {
	}

	/** minimal constructor */
	public AbstractInfo(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public AbstractInfo(String id, String name, String sex, String major,
			Date birth, String remark) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.major = major;
		this.birth = birth;
		this.remark = remark;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "AbstractInfo [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", major=" + major + ", birth=" + birth + ", remark="
				+ remark + "]";
	}

	
	
}