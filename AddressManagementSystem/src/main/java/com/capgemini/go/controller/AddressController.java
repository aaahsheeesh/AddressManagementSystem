package com.capgemini.go.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.go.dto.Address;
import com.capgemini.go.services.AddressService;



@RestController
public class AddressController {

	@Autowired
	AddressService addservice;
	
	
	@GetMapping("/address")
	private List<Address> viewAllAddress() 
	{
	return addservice.viewAllAddress();
	}


//	@GetMapping("/flight/{flightNumber}")
//	private Flight getFlights(@PathVariable("flightNumber") int flightNumber) 
//	{
//	return flightService.getFlightsByFlightNumber(flightNumber);
//	}

	@DeleteMapping("/address/{addressID}")
	private void deleteAddress(@PathVariable("addressID") int addressID) 
	{
	addservice.deleteAddress(addressID);
	}

	@PostMapping("/address")
	private Address addAddress(@RequestBody Address address) 
	{
	addservice.saveOrUpdate(address);
	return address;
	}

	@PutMapping("/address")
	private Address updateAddress(@RequestBody Address address) 
	{
	addservice.saveOrUpdate(address);
	return address;
	}






}





	
	
	
	
