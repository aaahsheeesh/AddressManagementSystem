package com.capgemini.go.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.go.dao.AddressDAO;
import com.capgemini.go.dto.Address;




@Service
public class AddressService {
	
	@Autowired
	AddressDAO adddao;
	
	public List<Address> viewAllAddress() 
	{
	List<Address> address = new ArrayList<>();
	adddao.findAll().forEach(address1 -> address.add(address1));
	return address;
	}

	
//	public Address getFlightsByFlightNumber(int flightNumber1) 
//	{
//	return flightRepository.findById(flightNumber1).get();
//	}

	public void saveOrUpdate(Address address) 
	{
	adddao.save(address);
	}


	public void deleteAddress(int addressID) 
	{
	adddao.deleteById(addressID);
	}

	public void updateAddress(Address address, int addressID) 
	{
	adddao.save(address);
	}
	

}
