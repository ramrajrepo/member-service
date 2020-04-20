package com.business.memberservice.service.master;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.business.memberservice.model.master.MemberShipPlan;


@Service
public interface MemberShipPlanService {
	
	public Optional<MemberShipPlan> save(MemberShipPlan memberShipPlan);
	public Optional<MemberShipPlan> saveOrUpdate(MemberShipPlan memberShipPlan);
	public Optional<MemberShipPlan> findById(Long id);
	public List<MemberShipPlan> findAll(Integer pageNo, Integer pageSize, String sortBy);
	public void deleteById(Long id);
	public boolean existsById(Long id);
}
