package Vo;

public class MasterCartVo {

	private int mastercartId;
	private String address;
	private String status;
	private int total;
	private LoginVo loginVo;
	
	public int getMastercartId() {
		return mastercartId;
	}
	public void setMastercartId(int mastercartId) {
		this.mastercartId = mastercartId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public LoginVo getLoginVo() {
		return loginVo;
	}
	public void setLoginVo(LoginVo loginVo) {
		this.loginVo = loginVo;
	}
	
	
}
