package cos.model.bean;

import java.util.Date;
//import java.sql.Date;

public class OfficialPostBean {
	//property
	private int postid;
	//private Date posttime;//datetime
	private String posttime;//test
	//private char[] unitnameTest = new char[2];//not sure
	private String unitname; //to save the data which is text in mysql
	private String content;
	private int poster;
	private String title;
	
	
	
	//set-get function
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setPoster(int poster){
		this.poster=poster;
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
	
//	public void setUnitnameTest(char[] unitnameTest){
//		this.unitnameTest=unitnameTest;
//	}
//	public char[] getUnitnameTest(){
//		return unitnameTest;
//	}
	
	public void setPosttime(String posttime){
		this.posttime=posttime;
	}
	public String getPosttime(){
		return posttime;
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
}