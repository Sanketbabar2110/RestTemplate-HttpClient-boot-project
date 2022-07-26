package com.prowing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowing.model.Friend;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	Environment environment;

	@Autowired
	RestTemplate restTemplate;

	@Value("${base_uri}")
	private String base_uri;

	@Override
	public Friend save(Friend entity) {
		return restTemplate.postForObject(base_uri, entity, Friend.class);
	}

	@Override
	public Friend getById(String Id) {
		String final_uri = base_uri.concat("/" + Id);
		return restTemplate.getForObject(final_uri, Friend.class);
	}

	@Override
	public List<Friend> getAll() {
		String final_uri = base_uri.concat("/" + "all");
		return restTemplate.getForObject(final_uri, List.class);
	}

	@Override
	public String put(Friend entity, String Id) {
		String final_uri = base_uri.concat("/" + Id);
		try {
			restTemplate.put(final_uri, entity);
			return "Movie Details Updated Successfully!!!";
		} catch (Exception e) {
			return "Issue in updating Movie Details!!!";
		}
	}

	@Override
	public String delete(String Id) {
		String final_uri = base_uri.concat("/" + Id);
		try {
			restTemplate.delete(final_uri);
			return "Movie Details Deleted Successfully!!!";
		} catch (Exception e) {
			return "Failed to remove Movie details!!!";
		}
	}
}
