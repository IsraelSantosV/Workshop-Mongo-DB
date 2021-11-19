package com.israelvieira.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.israelvieira.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User israel = new User("1", "Israel Santos", "IsraelS_Vieira@hotmail.com");
		User outro = new User("1", "Outro Pereira", "outro.pereira@hotmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(israel, outro));
		return ResponseEntity.ok().body(list);
	}

}
