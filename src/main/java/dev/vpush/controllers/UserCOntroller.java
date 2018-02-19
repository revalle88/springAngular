package dev.vpush.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.vpush.entities.User;
import dev.vpush.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserCOntroller {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.delete(id);
		return true; 
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@PostMapping("/user")
	public User createUser(User user) {
		return userRepository.save(user);
	}


}
