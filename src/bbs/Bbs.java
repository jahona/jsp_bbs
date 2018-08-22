package bbs;

public class Bbs {
	private String bbsId;
	private String bbsTitle;
	private String userId;
	private String bbsDate;
	private int bbsIsDeleted;
	
	public String getBbsId() {
		return bbsId;
	}
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBbsDate() {
		return bbsDate;
	}
	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}
	public int getBbsIsDeleted() {
		return bbsIsDeleted;
	}
	public void setBbsIsDeleted(int bbsIsDeleted) {
		this.bbsIsDeleted = bbsIsDeleted;
	}
}
