package Vo;

public class ContactUsVo {

	private int contactusId;
	private String name;
	private String phone;
	private String email;
	private String subject;
	private String comment;
	private String date;
	private String time;
	private LoginVo loginVoTo;
	private LoginVo loginVoFrom;
	
	
	
	public int getContactusId() {
		return contactusId;
	}
	public void setContactusId(int contactusId) {
		this.contactusId = contactusId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public LoginVo getLoginVoTo() {
		return loginVoTo;
	}
	public void setLoginVoTo(LoginVo loginVoTo) {
		this.loginVoTo = loginVoTo;
	}
	public LoginVo getLoginVoFrom() {
		return loginVoFrom;
	}
	public void setLoginVoFrom(LoginVo loginVoFrom) {
		this.loginVoFrom = loginVoFrom;
	}
	
	
}

