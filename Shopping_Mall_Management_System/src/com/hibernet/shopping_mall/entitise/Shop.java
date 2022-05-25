package com.hibernet.shopping_mall.entitise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")

public class Shop {
	
	@Id
	@Column(name = "shopId")
	private int shopId;
	
	@Column(name = "shopCategory")
	private String shopCategory;
	
	@Column(name = "shopEmployeeID")
	private Employee shopEmployeeID;
	
	@Column(name = "shopName")
	private String shopName;
	
	@Column(name = "customers")
	private String customers;
	
	@Column(name = "shopStatus")
	private String shopStatus;
	
	@Column(name = "shopOwner")
	private ShopOwner shopOwner;
	
	@Column(name = "leaseStatus")
	private String leaseStatus;
	
	@OneToMany()

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public Employee getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(Employee shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public Shop(int shopId, String shopCategory, Employee shopEmployeeID, String shopName, String customers,
			String shopStatus, ShopOwner shopOwner, String leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopEmployeeID = shopEmployeeID;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
