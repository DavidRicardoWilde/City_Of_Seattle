package cos.controller;

public class ShowPageService {
	//property
	private String pagename;
	
	//get-set function
	public void setPagename(String pagename){
		this.pagename=pagename;
	}
	public String getPagename(){
		return pagename;
	}

	//function
	public String showpage() throws Exception{
		System.out.println("ShowPageService: pagename is "+pagename);
//		//test code 07/16/2017 test content: the property can not be the object for return?
//		String returnPage = pagename;
//		System.out.println("ShowPageService: returnPage is "+returnPage);
//		//return "travel";
		//the action(url) in jsp is error.  showpage.action?pagename=travel is correct, showpage.action?pagename='travel' is wrong
		
		return pagename;
	}
}
