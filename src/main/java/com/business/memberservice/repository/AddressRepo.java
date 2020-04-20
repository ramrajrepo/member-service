package com.business.memberservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.business.memberservice.model.Address;

@RepositoryRestResource
public interface AddressRepo extends JpaRepository<Address, Long>{

	
}
