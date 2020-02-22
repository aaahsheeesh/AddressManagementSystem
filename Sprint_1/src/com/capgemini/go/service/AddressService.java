package com.capgemini.go.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.StringValueExp;

import com.capgemini.go.dto.AddressDTO;

public class AddressService {


	Map<String,AddressDTO> addressList = new HashMap<>();

	public AddressService() {
		super();
		setAddress();
	}

	public Map<String,AddressDTO> viewAllAddress() {

		return addressList;
	}

	private void setAddress() {
		addressList.put("1",new AddressDTO("1", "2", "3", "4", "5"));
		addressList.put("2", new AddressDTO("12", "22", "23", "24", "25"));
	}

	public void addAddress(AddressDTO address) {
		if(address!= null)
		{
			addressList.put(address.getAddressId(),address);
			viewAllAddress();
		}
		
	}

	    
//	private void updateAddress() {
//
//	}
//
	public void deleteAddress(String key) {
		if (String.valueOf(addressList).contains(key))
		{
		addressList.remove(key);
		System.out.println("object deleted at " + key + " value ");
		}
		//System.out.println(addressList);
	}

//	static public void toexit() {
//
//		System.out.print("See you soon :)");
//		System.exit(0);
//	}
		
//	}

}
