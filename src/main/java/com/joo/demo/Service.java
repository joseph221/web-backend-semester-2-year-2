package com.joo.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carservice")
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "QUANTITY")
	private int  Quantity;
	@Column(name = "Price")
	private int price;
	@Column(name = "PLATNO")
	private String plateNo;
	@Column(name = "REFNO")
	private int refNo;
	@Column(name = "LICENCENO")
	private long licence;
	
	public Service() {
		super();
	}
	
	
	public Service(Long iD, Date date, String description, int quantity, int price, String plateNo, int refNo,
			long licence) {
		super();
		ID = iD;
		this.date = date;
		this.description = description;
		Quantity = quantity;
		this.price = price;
		this.plateNo = plateNo;
		this.refNo = refNo;
		this.licence = licence;
	}


	public Service(Date date, String description, int quantity, int price, String plateNo, int refNo,
			long licence) {
		super();
		this.date = date;
		this.description = description;
		Quantity = quantity;
		this.price = price;
		this.plateNo = plateNo;
		this.refNo = refNo;
		this.licence = licence;
	}

	
	public long getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public int getRefNo() {
		return refNo;
	}
	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}
	public long getLicence() {
		return licence;
	}
	public void setLicence(long licence) {
		this.licence = licence;
	}
	
	
}
