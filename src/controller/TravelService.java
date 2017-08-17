package controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import model.MainPageRetrieveDataDAOInf;
import model.OfficalPhotoPathBean;
import model.OfficalPhotoPathDAOInf;
import model.OfficalPostImageBean;
import model.OfficalPostImageDAOInf;
import model.OfficialPostBean;

public class TravelService {
	//property
	private InputStream inputStream;
	private MainPageRetrieveDataDAOInf mainPageRetrieveDataDAOInf;
	private OfficalPostImageDAOInf officalPostImageDAOInf;
	private OfficalPhotoPathDAOInf officalPhotoPathDAOInf;
	
	//get-set function
	public void setOfficalPhotoPathDAOInf(OfficalPhotoPathDAOInf officalPhotoPathDAOInf){
		this.officalPhotoPathDAOInf=officalPhotoPathDAOInf;
	}
	public OfficalPhotoPathDAOInf getOfficalPhotoPathDAOInf(){
		return officalPhotoPathDAOInf;
	}
	
	public void setOfficalPostImageDAOInf(OfficalPostImageDAOInf officalPostImageDAOInf){
		this.officalPostImageDAOInf=officalPostImageDAOInf;
	}
	public OfficalPostImageDAOInf getOfficalPostImageDAOInf(){
		return officalPostImageDAOInf;
	}
	
	public void setMainPageRetrieveDataDAOInf (MainPageRetrieveDataDAOInf mainPageRetrieveDataDAOInf){
		this.mainPageRetrieveDataDAOInf=mainPageRetrieveDataDAOInf;
	}
	public MainPageRetrieveDataDAOInf getMainPageRetrieveDataDAOInf(){
		return mainPageRetrieveDataDAOInf;
	}
	
	public void setInputStream(InputStream inputStream){
		this.inputStream=inputStream;
	}
	public InputStream getInputStream(){
		return inputStream;
	}
	
	//fucntion
	public String retrievedata(){
		System.out.println("this is retrievedata in travelService");
		String inputStreamString = null;
		String inputStreamData=null;
		
		List listContent = null;
		List listIinfo = null;
		List listPaht = null;
		Iterator itertorContent =null;
		Iterator itertorIinfor =null;
		Iterator itertorIpath =null;
		
		OfficialPostBean officalPostBean = new OfficialPostBean();
		OfficalPhotoPathBean officalPhotoPathBean = new OfficalPhotoPathBean();
		OfficalPostImageBean officalPostImageBean = new OfficalPostImageBean();
		
		int numTotal = 0; //to calculate the number of total
		
		//test code
		
		String inputStreamStringTest = "{\"total\":\"2\",\"rows\":[{\"title\":\"this is the first title\",\"content\":\"this is the first content\"},{\"title\":\"this is the second title\",\"content\":\"this is the second content\"}]}";
		//inputStreamStringTest = "{\"total\":\"3\",\"rows\":[{\"title\":\"second test\",\"content\":\"something\",\"image\":\"E:\\MyEclipse Workspace 2014\\.metadata\\.me_tcat7\\webapps\\City_Of_Seattle\\public\\officalimage},{\"title\":\"this is the first test of foods \",\"content\":\"Foods Drink Resturants\",\"image\":\"E:\\MyEclipse Workspace 2014\\.metadata\\.me_tcat7\\webapps\\City_Of_Seattle\\public\\officalimage\"},{\"title\":\"travel test\",\"content\":\"this the first test\",\"image\":\"E:\\MyEclipse Workspace 2014\\.metadata\\.me_tcat7\\webapps\\City_Of_Seattle\\public\\officalimage\"}]}";
		//String inputStreamString = "{\"total\":\"1\",\"title\":\"this is the first title\",\"content\":\"this is the first content\"}";
		
		//test code
		try{
			System.out.println("begining");
			listContent = mainPageRetrieveDataDAOInf.queryList();
			itertorContent=listContent.iterator();
			listIinfo = officalPostImageDAOInf.queryList();
			itertorIinfor=listIinfo.iterator();
			listPaht = officalPhotoPathDAOInf.queryList();
			itertorIpath=listPaht.iterator();
			
			if(listContent.size()<=0 || listContent == null){
				System.out.println("list null");
			}
			
			while(itertorContent.hasNext()){
				numTotal++;
					System.out.println("numTotal = "+numTotal);
				if(inputStreamData == null){
					officalPostBean = (OfficialPostBean)itertorContent.next();
					inputStreamData = "{\"title\":\""+officalPostBean.getTitle()+"\",\"content\":\""+officalPostBean.getContent()+"\"";
					while(itertorIinfor.hasNext()){
						officalPostImageBean=(OfficalPostImageBean)itertorIinfor.next();
						if(officalPostImageBean.getPostid()==officalPostBean.getPostid()){
							String pathStr="public/officalimage/"+officalPostImageBean.getImage_name();
							inputStreamData=inputStreamData+",\"imagepath\":\""+pathStr+"\"}";
							break;
						}
					}
				}else{
					officalPostBean = (OfficialPostBean)itertorContent.next();
					inputStreamData = inputStreamData+",{\"title\":\""+officalPostBean.getTitle()+"\",\"content\":\""+officalPostBean.getContent()+"\"";
					while(itertorIinfor.hasNext()){
						officalPostImageBean=(OfficalPostImageBean)itertorIinfor.next();
						if(officalPostImageBean.getPostid()==officalPostBean.getPostid()){
							String pathStr="public/officalimage/"+officalPostImageBean.getImage_name();
							inputStreamData=inputStreamData+",\"imagepath\":\""+pathStr+"\"}";
							break;
						}
					}
				}
			}
			
			
//			while(itertorContent.hasNext()){
//				numTotal++;
//				if(inputStreamData==null){
//					officalPostBean = (OfficialPostBean)itertorContent.next();
//					inputStreamData = "{\"title\":\""+officalPostBean.getTitle()+"\",\"content\":\""+officalPostBean.getContent()+"\"";
//					while(itertorIinfor.hasNext()){
//						officalPostImageBean = (OfficalPostImageBean)itertorIinfor.next();
//						System.out.println("officalPostImageBean.getPostid() = "+officalPostImageBean.getPostid());
//						System.out.println("officalPostBean.getPostid() = "+officalPostBean.getPostid());
//						if(officalPostImageBean.getPostid() == officalPostBean.getPostid()){
//							while(itertorIpath.hasNext()){
//								System.out.println("+++++++++++");
//								officalPhotoPathBean = (OfficalPhotoPathBean)itertorIpath.next();
//								if(officalPhotoPathBean.getId()==officalPostImageBean.getId()){
//									String path = officalPhotoPathBean.getPath_file().replace('\\', '/');
//									path = path.replace("E:/MyEclipse Workspace 2014/.metadata/.me_tcat7/webapps/City_Of_Seattle/", "");
//									System.out.println(numTotal+" path = "+path);
//									inputStreamData = inputStreamData+",\"imagepath\":\""+path+"/"+officalPostImageBean.getImage_name()+"\"}";
//									
//								}
//								break;
//							}
//							break;
//						}
//					}
//				}else{
//					System.out.println("hasnext??");
//					officalPostBean = (OfficialPostBean)itertorContent.next();
//					inputStreamData = inputStreamData+",{\"title\":\""+officalPostBean.getTitle()+"\",\"content\":\""+officalPostBean.getContent()+"\"";
//					while(itertorIinfor.hasNext()){
//						officalPostImageBean = (OfficalPostImageBean)itertorIinfor.next();
//						System.out.println("officalPostImageBean.getPostid() = "+officalPostImageBean.getPostid());
//						System.out.println("officalPostBean.getPostid() = "+officalPostBean.getPostid());
//						if(officalPostImageBean.getPostid() == officalPostBean.getPostid()){
//							System.out.println("itertorIpath ="+itertorIpath);
//							while(itertorIpath.hasNext()){
//								officalPhotoPathBean = (OfficalPhotoPathBean)itertorIpath.next();
//								System.out.println("officalPhotoPathBean.getId() = "+officalPhotoPathBean.getId());
//								System.out.println("officalPostImageBean.getId() = "+officalPostImageBean.getId());
//								if(officalPhotoPathBean.getId()==officalPostImageBean.getId()){
//									String path = officalPhotoPathBean.getPath_file().replace('\\', '/');
//									path = path.replace("E:/MyEclipse Workspace 2014/.metadata/.me_tcat7/webapps/City_Of_Seattle/", "");
//									System.out.println(numTotal+" path = "+path);
//									inputStreamData = inputStreamData+",\"imagepath\":\""+path+"/"+officalPostImageBean.getImage_name()+"\"}";
//									break;
//								}
//							}
//							break;
//						}
//					}
//				}
//			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		inputStreamString = "{\"total\":\""+Integer.toString(numTotal)+"\",\"rows\":["+inputStreamData+"]}";
		System.out.println("inputStream = "+inputStreamString);
		System.out.println("intputStreamTest = "+inputStreamStringTest);
		
		try{
			inputStream = new ByteArrayInputStream(inputStreamString.getBytes("utf-8"));
		}catch (Exception e){
			System.out.println("e = "+e);
		}
		
		return "success";
	}
}