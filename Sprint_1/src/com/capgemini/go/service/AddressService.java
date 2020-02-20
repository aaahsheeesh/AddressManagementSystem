package com.capgemini.go.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.go.dto.AddressDTO;

public class AddressService {


	List<AddressDTO> addressList = new ArrayList<AddressDTO>();

//	public AddressService() {
//		super();
////		setAddress();
//	}

	public List<AddressDTO> viewAllAddress() {

		return addressList;
	}

//	private void setAddress() {
//		addressList.add(new AddressDTO("1", "2", "3", "4", "5"));
//		addressList.add(new AddressDTO("12", "22", "23", "24", "25"));
//	}

	public void addAddress(AddressDTO address) {
		if(address!= null)
		{
			addressList.add(address);
		//	viewAllAddress();
		}
		
	}

	    
//	private void updateAddress() {
//
//	}
//
//	private void deleteAddress() {
//
//	}
//
//	static public void toexit() {
//
//		System.out.print("See you soon :)");
//		System.exit(0);
//	}

}
