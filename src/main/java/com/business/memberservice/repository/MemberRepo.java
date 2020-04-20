package com.business.memberservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.business.memberservice.model.Member;


@Repository
public interface MemberRepo  extends JpaRepository<Member, Long>{


	@RestResource(path = "activecount")
    Long countByStatusTrue();
	
	@RestResource(path = "inactivecount")
    Long countByStatusFalse();
	

	

	
}
