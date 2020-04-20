package com.business.memberservice.service.master;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.business.memberservice.model.master.MemberShipPlan;
import com.business.memberservice.repository.master.MemberShipPlanRepo;

@Service
public class MemberShipPlanServiceImpl implements MemberShipPlanService{
	@Autowired
	private MemberShipPlanRepo repository;


	@Override
	public Optional<MemberShipPlan> save(MemberShipPlan memberShipPlan) {
		return Optional.ofNullable(repository.save(memberShipPlan));
	}

	@Override
	public Optional<MemberShipPlan> saveOrUpdate(MemberShipPlan memberShipPlan) {
		return Optional.ofNullable(repository.saveAndFlush(memberShipPlan));
	}

	@Override
	public Optional<MemberShipPlan> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<MemberShipPlan> findAll(Integer pageNo, Integer pageSize, String sortBy) {
		   Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
	       Page<MemberShipPlan> pagedResult = repository.findAll(paging);
           return pagedResult.getContent();
       
	}

	@Override
	public void deleteById(Long id) {
			repository.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}


}
