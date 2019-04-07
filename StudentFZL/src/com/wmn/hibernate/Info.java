package com.wmn.hibernate;

import java.util.Date;

/**
 * Info entity. @author MyEclipse Persistence Tools
 */
public class Info extends AbstractInfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Info() {
	}

	/** minimal constructor */
	public Info(String id, String name) {
		super(id, name);
	}

	/** full constructor */
	public Info(String id, String name, String sex, String major, Date birth,
			String remark) {
		super(id, name, sex, major, birth, remark);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	

}
