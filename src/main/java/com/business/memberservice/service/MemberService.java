package com.business.memberservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.business.memberservice.model.Member;

@Service
public interface MemberService {
	
	public Optional<Member> save(Member member);
	public Optional<Member> saveOrUpdate(Member member);
	public Optional<Member> findById(Long id);
	public List<Member> findAll(Integer pageNo, Integer pageSize, String sortBy);
	public void deleteById(Long id);
	public boolean existsById(Long id);
}
