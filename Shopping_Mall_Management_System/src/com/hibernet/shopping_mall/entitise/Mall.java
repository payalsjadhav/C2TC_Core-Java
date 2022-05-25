package com.hibernet.shopping_mall.entitise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Mall")

public class Mall {
	
	@Id
	@Column(name = "mallID")
	private int mallId;
	
	@Column(name = "mallAdmin")
	private MallAdmin mallAdmin;
	
	@Column(name = "mallName")
	private String mallName;
	
	@Column(name = "malllocation")
	private String malllocation;
	
	@Column(name = "shop_id")
	private Shop shop_id;
	
	@Column(name = "categories")
	private String categories;
	
	@OneToOne(cascade = CascadeType.ALL)
	

	public int getMallId() {
		return mallId;
	}

	public void setMallId(int mallId) {
		this.mallId = mallId;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMalllocation() {
		return malllocation;
	}

	public void setMalllocation(String malllocation) {
		this.malllocation = malllocation;
	}

	public Shop getShop_id() {
		return shop_id;
	}

	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public Mall(int mallId, MallAdmin mallAdmin, String mallName, String malllocation, Shop shop_id,
			String categories) {
		super();
		this.mallId = mallId;
		this.mallAdmin = mallAdmin;
		this.mallName = mallName;
		this.malllocation = malllocation;
		this.shop_id = shop_id;
		this.categories = categories;
	}

	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
