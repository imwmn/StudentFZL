package com.wmn.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.opensymphony.xwork2.Action;
import com.wmn.hibernate.Info;
import com.wmn.hibernate.InfoDAO;


public class AddUserAction implements Action,ServletRequestAware {
	
	
	  private HttpServletRequest request=null;
		
   
	@Override
	public String execute() throws Exception {
		
		ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("applicationContext.xml");; 
		InfoDAO dao=(InfoDAO) resource.getBean("InfoDAO"); 
		
//		InfoDAO dao = new InfoDAO();
				
		String id =request.getParameter("id");
		String name =request.getParameter("name");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String birth = request.getParameter("birth");
		String remark = request.getParameter("remark");
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	       
		Info info = new Info(id,name,sex,major,sdf.parse(birth),remark);
		if(dao.save(info)){
			return SUCCESS;
		}else{
			return "fail";
		}
		
		
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	

}
