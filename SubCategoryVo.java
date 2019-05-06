package Vo;

import java.io.Serializable;

public class SubCategoryVo implements Serializable{

	private int subcategoryId;
	private String subcategoryName;
	private String subcategoryDescription;
	private CategoryVo categoryVo;

	public int getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	public String getSubcategoryDescription() {
		return subcategoryDescription;
	}
	public void setSubcategoryDescription(String subcategoryDescription) {
		this.subcategoryDescription = subcategoryDescription;
	}
	public CategoryVo getCategoryVo() {
		return categoryVo;
	}
	public void setCategoryVo(CategoryVo categoryVo) {
		this.categoryVo = categoryVo;
	}
	
	
}
