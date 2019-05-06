package Vo;

import java.io.Serializable;

public class ProductVo implements Serializable {
	
	private int productId;
	private String productName;
	private int productPrice;
	private String productDescription;
	private CategoryVo categoryVo;
	private SubCategoryVo subcategoryVo;
	private attachmentVo attachmentVo;
	
	public attachmentVo getAttachmentVo() {
		return attachmentVo;
	}
	public void setAttachmentVo(attachmentVo attachmentVo) {
		this.attachmentVo = attachmentVo;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public CategoryVo getCategoryVo() {
		return categoryVo;
	}
	public void setCategoryVo(CategoryVo categoryVo) {
		this.categoryVo = categoryVo;
	}
	public SubCategoryVo getSubcategoryVo() {
		return subcategoryVo;
	}
	public void setSubcategoryVo(SubCategoryVo subcategoryVo) {
		this.subcategoryVo = subcategoryVo;
	}
	
	
}
