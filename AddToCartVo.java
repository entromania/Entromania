package Vo;

public class AddToCartVo {

	private int addtocartId;
	private String itemName;
	private int price;
	private int qty;
	private int subtotal;
	private MasterCartVo masterCartVo;
	private ProductVo productId;
	
	public int getAddtocartId() {
		return addtocartId;
	}
	public void setAddtocartId(int addtocartId) {
		this.addtocartId = addtocartId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	public MasterCartVo getMasterCartVo() {
		return masterCartVo;
	}
	public void setMasterCartVo(MasterCartVo masterCartVo) {
		this.masterCartVo = masterCartVo;
	}
	public ProductVo getProductId() {
		return productId;
	}
	public void setProductId(ProductVo productId) {
		this.productId = productId;
	}
	
	
	
}
