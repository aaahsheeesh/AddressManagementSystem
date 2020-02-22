package com.capgemini.go.service;

import java.util.HashMap;

import java.util.Map;

import com.capgemini.go.dto.AddressDTO;

public class AddressService {

	Map<String, AddressDTO> addressList = new HashMap<>();

	public AddressService() {
		super();
		setAddress();
	}

	public Map<String, AddressDTO> viewAllAddress() {

		return addressList;
	}

	private void setAddress() {
		addressList.put("1", new AddressDTO("11", "2", "3", "4", "5"));
		addressList.put("2", new AddressDTO("22", "22", "23", "24", "25"));
		addressList.put("3", new AddressDTO("33", "22", "23", "24", "25"));
		addressList.put("4", new AddressDTO("44", "22", "23", "24", "25"));
		addressList.put("5", new AddressDTO("55", "22", "23", "24", "25"));
		addressList.put("6", new AddressDTO("666", "22", "23", "24", "25"));
		addressList.put("7", new AddressDTO("77", "22", "23", "24", "25"));
		addressList.put("8", new AddressDTO("88", "22", "23", "24", "25"));
		addressList.put("9", new AddressDTO("99", "22", "23", "24", "25"));
		
	}

	public void addAddress(AddressDTO address) {
		if (address != null) {
			addressList.put(address.getAddressId(), address);
			viewAllAddress();
		}

	}

	public void updateAddress(String keyId,AddressDTO address) {

		
		if (addressList != null) {
			addressList.put(String.valueOf(keyId), address);
		
			System.out.println("address " + addressList  + " has been replaced on the address database");
		} else {
			System.out.println("Specified address not found");
		}

	}

	public void deleteAddress(String key) {
		if (String.valueOf(addressList).contains(key)) {
			addressList.remove(key);
			System.out.println("object deleted at " + key + " value ");
		}
		else
		{
			System.out.println("please enter the valid key");
		}

	}
	
	static public void toExit() {

		System.out.print("See you soon :)");
		System.exit(0);
	}

	}


