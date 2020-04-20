package com.business.memberservice.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.business.memberservice.model.master.MemberShipPlan;
@RepositoryRestResource
public interface MemberShipPlanRepo extends JpaRepository<MemberShipPlan, Long>{

}
