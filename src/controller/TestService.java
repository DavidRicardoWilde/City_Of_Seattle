package controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class TestService {
	private File image;
    private String imageFileName;
    private String imageContentType;
    
	public File getImage() {
		return image;  
	}  
	public void setImage(File image) { 
		System.out.println("image :"+image);
		this.image = image;  
	}  
	public String getImageFileName() {  
		return imageFileName;  
	}  
	public void setImageFileName(String imageFileName) {  
	     this.imageFileName = imageFileName;  
	}
	
	public String getImageContentType() {  
	     return imageContentType;  
	}  
	 public void setImageContentType(String imageContentType) {  
	     this.imageContentType = imageContentType;  
	 }
	 
	 public String testPostImage(){
		 String savepath = ServletActionContext.getServletContext().getRealPath("/public/officalimage");
			System.out.println("savepath = "+savepath);
				//test code
			System.out.println("image is = "+image);
			System.out.println("imagename is = "+image);
			
			if(image != null){
				System.out.println("imagefile is exists");
				File savefile = new File(new File(savepath), imageFileName);
				System.out.println(savefile.getParentFile());
				if(savefile.getParentFile().exists()){
					try {  
	                   savefile.getParentFile().mkdirs();  
	                   FileUtils.copyFile(image, savefile);  
	                } catch (IOException e) {  
	                    e.printStackTrace();  
	                } 
					System.out.println("save successful");
				}
			}else{
				System.out.println("imagefile is not exist");
			}
		 
		 return "error";
	 }
}
