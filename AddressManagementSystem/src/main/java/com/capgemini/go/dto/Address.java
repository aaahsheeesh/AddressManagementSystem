package com.capgemini.go.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Id
	@Column
	private int addressID;
	@SuppressWarnings("unused")
	@Column
	private int retailerID;
	@Column
	private String buildingNO;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String filed;
	@Column
	private String zip;
	
	
	
	
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
//	public int getRetailerID() {
//		return retailerID;
//	}
//	public void setRetailerID(int retailerID) {
//		this.retailerID = retailerID;
//	}
	public String getBuildingNO() {
		return buildingNO;
	}
	public void setBuildingNO(String buildingNO) {
		this.buildingNO = buildingNO;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFiled() {
		return filed;
	}
	public void setFiled(String filed) {
		this.filed = filed;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	@Override
	public String toString() {
		return "AddressDTO [addressID=" + addressID + ", buildingNO=" + buildingNO + ", city=" + city + ", state="
				+ state + ", filed=" + filed + ", zip=" + zip + "]";
	}
	
	
	
	public Address(int addressID, int retailerID, String buildingNO, String city, String state, String filed,
			String zip) {
		super();
		this.addressID = addressID;
		this.buildingNO = buildingNO;
		this.city = city;
		this.state = state;
		this.filed = filed;
		this.zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
