package model;

import java.time.LocalDate;

public class Blog{
	private int blogId;
	private String blogTitle;
	private String blogDescription;
	LocalDate posted_on;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	public LocalDate getPostedOn() {
		return posted_on;
	}
	public void setPostedOn(LocalDate posted_on) {
		this.posted_on = posted_on;
	}
	
}