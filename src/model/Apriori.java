package model;

public class Apriori {
	
	private String general;
	private int pr;
	private String title;
	private String body;
	private String author;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getGeneral() {
		return general;
	}
	public void setGeneral(String general) {
		this.general = general;
	}
	public int getPr() {
		return pr;
	}
	public void setPr(int pr) {
		this.pr = pr;
	}
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		this.author = author;
	}
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

}
