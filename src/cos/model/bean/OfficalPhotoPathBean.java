package cos.model.bean;

public class OfficalPhotoPathBean {
	//property
	private int id;
	private String path_file;
	
	//get-set function
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setPath_file(String path_file){
		this.path_file=path_file;
	}
	public String getPath_file(){
		return path_file;
	}
}
