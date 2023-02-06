package vo;

import org.springframework.web.multipart.MultipartFile;

public class PhotoVO {
	
	//받아오는 항목 
	//제목 : <input name ="title" ><br>
	//사진 : <input type="file" name="photo"><br>:
	
	private String title;
	private MultipartFile photo;   //이게 없으면 용량도 모르고 , 이름도 모르기 떄문에 있어야 한다 .
	private String filename;  //업로드된 파일명 이름 
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
