package controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
//import java.sql.Date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import model.AdminBean;
import model.AdminDAO;
import model.AdminDAOInf;
import model.AdminOptDAOInf;
import model.OfficialPostBean;

public class AdminService {
	//property
		//for login
	private String username;
	private String email;
	private String password;
		//for article submit
	private int postid;
	//private Date posttime;
	private String unitname; 
	private String content;
	private int poster;
	private String title;
		//---basic property----
	private InputStream inputStream;
	private AdminDAOInf adminDAOInf;
	private AdminOptDAOInf adminOptDAOInf;
		//DAO & Bean
	//private AdminBean adminBean;
	
	//get-set function
	public void setAdminOptDAOInf(AdminOptDAOInf adminOptDAOInf){
		this.adminOptDAOInf=adminOptDAOInf;
	}
	public AdminOptDAOInf getAdminOptDAOInf(){
		return adminOptDAOInf;
	}
//	public void setAdminDAO(AdminDAO adminDAO){
//		this.adminDAO=adminDAO;
//	}
//	public AdminDAO getAdminDAO(){
//		return adminDAO;
//	}
	
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setPoster(String poster){
		this.poster=Integer.parseInt(poster);
	}
	public int getPoster(){
		return poster;
	}
	
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	
	public void setUnitname(String unitname){
		this.unitname=unitname;
	}
	public String getUnitname(){
		return unitname;
	}
	
//	public void setDatetime(Date datetime){
//		this.datetime=datetime;
//	}
//	public Date getDatetime(){
//		return datetime;
//	}
	
	public void setPostid(int postid){
		this.postid=postid;
	}
	public int getPostid(){
		return postid;
	}
	
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
	
	public void setAdminDAOInf(AdminDAOInf adminDAOInf){
		this.adminDAOInf = adminDAOInf;
	}
	public AdminDAOInf getAdminDAOInf(){
		return adminDAOInf;
	}
	
//	public void setAdminBean(AdminBean adminBean){
//		this.adminBean=adminBean;
//	}
//	public AdminBean getAdminBean(){
//		return adminBean;
//	}
	
	//function
		//submit Article
	public void sumbitArticle() throws Exception{
		System.out.println("this is submitArticle function");
			//set the datetime
		Date datetime = new Date();
		System.out.println("something wrong");
			//test code: hibernate can set the date by auto
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetimeTest = sdf.format(datetime);
		
		OfficialPostBean officialPostBean = new OfficialPostBean();
		//officialPostBean.setPostid(postid); no need
		officialPostBean.setTitle(title);
		officialPostBean.setContent(content);
		officialPostBean.setUnitname(unitname);
		//officialPostBean.setDatetime(datetime);
		officialPostBean.setPosttime(datetimeTest);
		officialPostBean.setPoster(poster);
		
			//testcode
//		System.out.println("title = "+officialPostBean.getTitle());
//		System.out.println("content = "+officialPostBean.getContent());
//		System.out.println("unitname = "+officialPostBean.getUnitname());
//		System.out.println("poster = "+officialPostBean.getPoster());
//		System.out.println("datetime = "+officialPostBean.getPosttime());
		System.out.println("poster = "+officialPostBean.getPoster());

		inputStream=new ByteArrayInputStream("{\"success\":1}".getBytes("UTF-8"));
		adminOptDAOInf.addObjt(officialPostBean);
	}
	
		//set admin session
	public void adminsessionset(int adminId){
		System.out.println("this is adminsessionset function");
			//test code: check adminid
			//System.out.println("adminid ="+adminId);
		Map<String,Object> mapSession;
		ActionContext.getContext().getSession().put("adminId",adminId);
	}
	
		//admin login
	public String adminlogin() throws Exception{
		AdminBean adminBean = new AdminBean();
		AdminBean adminBeanDB = new AdminBean();
		String hqlStr = null;
		Iterator iterator =null;	
		String result = null;
		String inputStreamString = null;
		List list = null;
		int success = 0;
		
		System.out.println("this is AdminService's adminlogin function");
		try{
			System.out.println("this is try catch model");
			
			adminBean.setUsername(username);
			adminBean.setPassword(password);
			adminBean.setEmail(email);
			
			//test code: print username and password
			System.out.println("username = "+username);
			System.out.println("password = "+password);
			 	//test over
			
			hqlStr = "from AdminBean where username = '"+adminBean.getUsername()+"'";
				//System.out.println("something is error start here"); test --over
				//adminDAOInf.testCode();   test Code --over
 			list = adminDAOInf.queryByHql(hqlStr);
			iterator = list.iterator();
			
			//test code: whether get the list
				//System.out.println("whether get the list");
			
			if(list.size()<=0 || list == null){
				System.out.println("list null");
			}
			
			while(iterator.hasNext()){
				if(adminBean.getUsername() == null){
					adminBeanDB = (AdminBean)iterator.next();
				}else{
					if(adminBean.getUsername().equals(adminBeanDB.getUsername())){
						break;
					}else{
						adminBeanDB=(AdminBean)iterator.next();
					}
				}
			}
			
			if(adminBean.getUsername() == null){
				result = "0101";
			}else{
				if(adminBean.getUsername().equals(adminBeanDB.getUsername())){
					if(adminBean.getPassword().equals(adminBeanDB.getPassword())){
						result = "0001";
							//test code: check adminid
						//System.out.println("adminbean adminid = "+adminBeanDB.getAdminid());
							//set admin session
						adminsessionset(adminBeanDB.getAdminid());
						success = 1;
					}else{
						result = "0011";
					}
				}else{
					result = "0010";
				}
			}
			
			inputStreamString = "{\"success\":"+success+",\"return code\":\""+result+"\"}";
			inputStream = new ByteArrayInputStream(inputStreamString.getBytes("utf-8"));
			System.out.println("inputStreamString = "+inputStreamString);
			return "success";
		}catch(Exception e){
			inputStreamString = "{\"success\":0,\"return code\":\"0000\"}";
			inputStream = new ByteArrayInputStream(inputStreamString.getBytes("utf-8"));
			return "SYSTEM ERROR";
		}
	} 
	/*
	 * //json: inputStreamString: {\"success":成功为1 错误为：0； \"return code\":
	 * "0000:unknown error ，0001：success，
	 * 0010：username not found，0011：password error,
	 * 0100:unable to connect to database, 0101: check username\""}*/
}
