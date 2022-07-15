package com.dhathika.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity	
@Table(name = "PRODUCT_Details")
public class Product {
	
	@Id
	@TableGenerator(
			name="myGenerator",
			initialValue=6542,
			allocationSize=1,
			table="PK_VALUE_TAB",
			pkColumnName="PK_COLUMN",
			pkColumnValue="PK_VALUE", 
			valueColumnName="PK_VALUE_COLUMN")
@GeneratedValue(strategy=GenerationType. TABLE, generator="myGenerator")

	private int pId;
	
//	@Column(name = "PRODUCT_NAME")
	@Column
	private String pName;
	
//	@Column(name = "PRODUCT_PRICE", nullable = false, precision=8, scale=2)
	@Column(name = "Product_Price")
	private double pPrice;
	
//	@Column(name = "PRODUCT_BRAND"  )
	@Column(name = "Product_Brand")
	private String pBrand;
	
//	@Column(name =  "PRODUCT_MANIFACTURER")
	@Column
	private String pManifacturerName;
	
	@Temporal(TemporalType.DATE)
	@Column
//	@Column(name = "PRODUCT_MANIFACTURING_DATE")
	private Date pManifuringDate;
	
	@Temporal(TemporalType.DATE)
	@Column
//	@Column(name = "PRODUCT_EXPIRY_DATE")
	private Date pExpiryDate;
	
	@Column(name = "SHELL_TYPE")
	private String shellType;
	


	
	public Product(int pId, String pName, double pPrice, String pBrand, String pManifacturerName, Date pManifuringDate,
			Date pExpiryDate, String shellType) {
	
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pBrand = pBrand;
		this.pManifacturerName = pManifacturerName;
		this.pManifuringDate = pManifuringDate;
		this.pExpiryDate = pExpiryDate;
		this.shellType = shellType;
	}

	public Product( String pName, double pPrice, String pBrand, String pManifacturerName, Date pManifuringDate,
			Date pExpiryDate) {

		this.pName = pName;
		this.pPrice = pPrice;
		this.pBrand = pBrand;
		this.pManifacturerName = pManifacturerName;
		this.pManifuringDate = pManifuringDate;
		this.pExpiryDate = pExpiryDate;
	}

	public Product() {

	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public String getpBrand() {
		return pBrand;
	}

	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}

	public String getpManifacturerName() {
		return pManifacturerName;
	}

	public void setpManifacturerName(String pManifacturerName) {
		this.pManifacturerName = pManifacturerName;
	}

	public Date getpManifuringDate() {
		return pManifuringDate;
	}

	public void setpManifuringDate(Date pManifuringDate) {
		this.pManifuringDate = pManifuringDate;
	}

	public Date getpExpiryDate() {
		return pExpiryDate;
	}

	public void setpExpiryDate(Date pExpiryDate) {
		this.pExpiryDate = pExpiryDate;
	}
	

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pBrand=" + pBrand
				+ ", pManifacturerName=" + pManifacturerName + ", pManifuringDate=" + pManifuringDate + ", pExpiryDate="
				+ pExpiryDate + "]";
	}

}
