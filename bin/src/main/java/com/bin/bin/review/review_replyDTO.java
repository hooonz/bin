package com.bin.bin.review;

public class review_replyDTO {
	private int reply_num;
	private String reply_content;
	private int review_num;
	private String businessId;
	private String userId;
	
	public int getReply_num() {return reply_num;}
	public void setReply_num(int reply_num) {this.reply_num = reply_num;}
	public String getReply_content() {return reply_content;}
	public void setReply_content(String reply_content) {this.reply_content = reply_content;}
	public int getReview_num() {return review_num;}
	public void setReview_num(int review_num) {this.review_num = review_num;}
	public String getBusinessId() {return businessId;}
	public void setBusinessId(String businessId) {this.businessId = businessId;}
	public String getUserId() {return userId;}
	public void setUserId(String userId) {this.userId = userId;}
}
