package com.educando.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educando.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
		@GetMapping
		public ResponseEntity<User> findAll(){
			User u = new User(1L, "Maria", "@gmail", "123455", "12345");
			return ResponseEntity.ok().body(u);
		}
}
