package cos.model.bean;

public class OfficalPostImageBean {
	//property
	private int id;
	private String image_name;
	private int postid; //
	
	//get-set function
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setImage_name(String image_name){
		this.image_name=image_name;
	}
	public String getImage_name(){
		return image_name;
	}
	
	public void setPostid(int postid){
		this.postid=postid;
	}
	public int getPostid(){
		return postid;
	}
}
