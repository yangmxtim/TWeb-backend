package com.shoppingwebapp.Service;

import java.util.List;

import com.shoppingwebapp.Model.Member;

public interface MemberManageService {
	
	Member findById(int id);
	
	List<Member> findBySearch(String searchText);

	List<Member> findAll();

	Member save(Member bean);
	
	Member update(Member bean); 

	void deleteById(Integer key);
	
	List<Member> findByPermission(boolean isAdmin);
}