package user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.management.pojo.User;
import user.management.service.UserManagementService;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserManagementController {

	@Autowired
	public UserManagementService userService;

	public UserManagementController(UserManagementService service) {
		this.userService = service;
	}

	@PostMapping("/postuser")
	public User postUser(@RequestBody User user) {
		return userService.storeUser(user);
	}

	@GetMapping("/getuser/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}
	

}
