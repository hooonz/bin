package com.bin.bin.review;

public class reviewDTO {
	private int review_num;
	private String review_title;
	private String review_content;
	private String review_img;
	private String userId;
	private String businessId;
	
	public int getReview_num() {return review_num;}
	public void setReview_num(int review_num) {this.review_num = review_num;}
	public String getReview_title() {return review_title;}
	public void setReview_title(String review_title) {this.review_title = review_title;}
	public String getReview_content() {return review_content;}
	public void setReview_content(String review_content) {this.review_content = review_content;}
	public String getReview_img() {return review_img;}
	public void setReview_img(String review_img) {this.review_img = review_img;}
	public String getUserId() {return userId;}
	public void setUserId(String userId) {this.userId = userId;}
	public String getBusinessId() {return businessId;}
	public void setBusinessId(String businessId) {this.businessId = businessId;}
}
