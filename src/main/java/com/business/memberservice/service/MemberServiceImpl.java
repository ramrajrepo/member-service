package com.business.memberservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.business.memberservice.model.Member;
import com.business.memberservice.repository.MemberRepo;
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepo repository;


	@Override
	public Member save(Member member) {
		return repository.save(member);
	}

	@Override
	public Member saveOrUpdate(Member member) {
		return repository.saveAndFlush(member);
	}

	@Override
	public Optional<Member> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Member> findAll(Integer pageNo, Integer pageSize, String sortBy) {
		   Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
	       Page<Member> pagedResult = repository.findAll(paging);
           return pagedResult.getContent();
       
	}

	@Override
	public void deleteById(Long id) {
		if(repository.existsById(id))
			repository.deleteById(id);
		
	}



}
