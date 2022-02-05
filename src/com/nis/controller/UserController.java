package com.nis.controller;

import java.sql.ResultSet;


import com.nis.dao.DbHelper;

import com.nis.model.User;


public class UserController {

	 public static User checkLogin(int id,String password )
	 { try{
		String query="select * from user where userid="+id+" and password='"+password+"'";
		ResultSet rs=DbHelper.executeQuery(query);
		if(rs.next())
		{User U=new User();
		U.setUserid(rs.getString(1));
	     U.setUsername(rs.getString(2));
	    U.setPassword(rs.getString(12));
		U.setPicture(rs.getString(13));
		return(U);
	 	}
		return(null);
		 
	 }catch(Exception e){
	  System.out.println("User:checkLogin():"+e);	 
		 return(null);
	 }
	 }
	 public static boolean addNewRecord(User U)
	 {try{
	  String query="insert into user(username,gender,dob,address,state,city,designation,salary,email,mobileno,picture,password) values('"+U.getUsername()+"','"+U.getGender()+"','"+U.getDob()+"','"+U.getAddress()+"','"+U.getState()+"','"+U.getCity()+"','"+U.getDesignation()+"',"+U.getSalary()+",'"+U.getEmail()+"','"+U.getMobileno()+"','"+U.getPicture()+"','"+U.getPassword()+"')";
	  boolean status=DbHelper.executeUpdate(query);
	  return(status);
	 	
	 }catch(Exception e)
	 { System.out.println("Error:addNewRecord()"+e);
	 	}
	 return(false);	

	 }
	 public static ResultSet displayAll()
	 {try{
	  String query="select U.userid,U.username,U.gender,U.dob,U.address,U.state,U.city,U.designation,U.salary,U.email,U.mobileno,U.picture,(select statename from states S where S.stateid=U.state),(select cityname from cities C where C.cityid=U.city) from user U";
	  ResultSet rs=DbHelper.executeQuery(query);
	  return(rs);
	 	
	 }catch(Exception e)
	 { System.out.println("Error:displayAll()"+e);
	 	}
	 return(null);	

	 }
	 public static User displayByID(int uid)
	 {try{
	  String query="select U.userid,U.username,U.gender,U.dob,U.address,U.state,U.city,U.designation,U.salary,U.email,U.mobileno,U.picture,(select statename from states S where S.stateid=U.state),(select cityname from cities C where C.cityid=U.city),U.password from user U where U.userid="+uid;
	  ResultSet rs=DbHelper.executeQuery(query);
	  if(rs.next())
	  {User U=new User();
	  U.setUserid(rs.getString(1));
	  U.setUsername(rs.getString(2));
	  U.setGender(rs.getString(3));
	  U.setDob(rs.getString(4));
	  U.setAddress(rs.getString(5));
	  U.setState(rs.getString(6)+","+rs.getString(13));
	  U.setCity(rs.getString(7)+","+rs.getString(14));
	  U.setDesignation(rs.getString(8));
	  U.setSalary(Long.parseLong(rs.getString(9)));
	  U.setEmail(rs.getString(10));
	  U.setMobileno(rs.getString(11));
	  U.setPicture(rs.getString(12));
	  U.setPassword(rs.getString(15));
	  return(U);
	  
	  
	 	 
	 	 
	  }
	  return(null);
	  
	 }catch(Exception e)
	 { System.out.println("Error:displayAll()"+e);
	 	}
	 return(null);	
	 }

	 public static boolean editRecord(User U)
	 {try{
	  String query="update user set username='"+U.getUsername()+"',gender='"+U.getGender()+"',dob='"+U.getDob()+"',address='"+U.getAddress()+"',state='"+U.getState()+"',city='"+U.getCity()+"',designation='"+U.getDesignation()+"',salary="+U.getSalary()+",email='"+U.getEmail()+"',mobileno='"+U.getMobileno()+"',password='"+U.getPassword()+"' where userid="+U.getUserid();
	  System.out.println(query);
	  boolean status=DbHelper.executeUpdate(query);
	  return(status);
	 	
	 }catch(Exception e)
	 { System.out.println("Error:editRecord()"+e);
	 	}
	 return(false);	

	 }

	 public static boolean editPicture(int uid,String filename)
	 {try{
	  String query="update user set picture='"+filename+"' where userid="+uid;
	  System.out.println(query);
	  boolean status=DbHelper.executeUpdate(query);
	  return(status);
	 	
	 }catch(Exception e)
	 { System.out.println("Error:editRecord()"+e);
	 	}
	 return(false);	

	 }





	 public static boolean deleteRecord(int eid)
	 {try{
	  String query="Delete from user where userid="+eid;
	  boolean status=DbHelper.executeUpdate(query);
	  return(status);
	 	
	 }catch(Exception e)
	 { System.out.println("Error:deleteRecord()"+e);
	 	}
	 return(false);	

	 }

	
















}
