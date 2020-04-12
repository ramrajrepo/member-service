package com.business.memberservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.business.memberservice.model.Member;

@Service
public interface MemberService {
	
	public Member saveEntityService(Member member);
	public Member updateEntityService(Member member);
	public Optional<Member> getEntityService(Long id);
	public List<Member> getAllEntityService(Integer pageNo, Integer pageSize, String sortBy);
	public void deleteEntityService(Long id);
	
}
