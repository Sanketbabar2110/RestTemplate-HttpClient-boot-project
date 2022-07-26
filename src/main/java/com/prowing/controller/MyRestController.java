package com.prowing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowing.model.Friend;
import com.prowing.service.MyService;

@RestController
@RequestMapping("/friends")
public class MyRestController {

	@Autowired
	MyService service;
	
	@GetMapping("/{Id}")
	private ResponseEntity<Friend> get(@PathVariable("Id") String Id) {
		return ResponseEntity.ok(service.getById(Id));
	}

	@GetMapping("/all")
	private ResponseEntity<?> get() {
		return ResponseEntity.ok(service.getAll());
	}

	@PostMapping
	private ResponseEntity<?> add(@RequestBody Friend entity) {
		return ResponseEntity.ok(service.save(entity));
	}

	@PutMapping("/{Id}")
	private ResponseEntity<?> update(@RequestBody Friend entity, @PathVariable("Id") String Id) {
		return ResponseEntity.ok(service.put(entity, Id));
	}

	@DeleteMapping("/{Id}")
	private ResponseEntity<?> delete(@PathVariable("Id") String Id) {
		return ResponseEntity.ok(service.delete(Id));
	}
}
