package com.capgemini.go.dao;

import org.springframework.data.repository.CrudRepository;


import com.capgemini.go.dto.Address;

public interface AddressDAO extends CrudRepository<Address, Integer> {

}
