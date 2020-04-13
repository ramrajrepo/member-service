package com.business.memberservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.business.memberservice.model.Member;


@Repository
public interface DietChartRepo extends JpaRepository<Member, Long>{

	
}
