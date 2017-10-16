package cos.controller;

public class BaseMainPageService {
	//property
	private String page;
		//other server
	private TravelService trService;
	
	//get-set function
	public void setPage(String page){
		this.page=page;
	}
	public String getPage(){
		return page;
	}
	
	//function
	public String switchpage() throws Exception{
		//System.out.println("page is "+page);
		String rtnResult = null;
		switch(page){
		case "travel":
			rtnResult = trService.retrievedata();
			break;
		}
		
		return rtnResult;
	}
}
