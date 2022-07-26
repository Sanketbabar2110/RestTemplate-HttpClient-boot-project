package com.prowing.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.prowing.model.Friend;

public interface MyService {
	
	public Friend save(Friend entity);
	
	public Friend getById(String Id);
	
	public List<Friend> getAll();
	
	public String put(Friend entity, String Id);
	
	public String delete(String Id);
}
