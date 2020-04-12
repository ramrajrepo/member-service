package com.business.memberservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.business.memberservice.model.Member;


@Repository
public interface MemberRepo extends JpaRepository<Member, Long>{


	@RestResource(path = "activecount")
    Long countByIsActiveTrue();
	
	@RestResource(path = "inactivecount")
    Long countByIsActiveFalse();
	
	@RestResource(path = "deletedmember")
	List<Member> findByisDeletedTrue();
	
	

	
}
