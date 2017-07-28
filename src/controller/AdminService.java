package controller;

import java.io.InputStream;

public class AdminService {
	//property
	private String username;
	private String email;
	private String password;
		//---basic property----
	private InputStream inputStream;
	
	//function
	public String adminlogin() throws Exception{
		try{
			return "success";
		}catch(Exception e){
			return "SYSTEM ERROR";
		}
	}
	
	//get-set function
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
		//--- ----
	public void setInputStream(InputStream inputStream){
		this.inputStream=inputStream;
	}
	public InputStream getInputStream(){
		return inputStream;
	}
}
