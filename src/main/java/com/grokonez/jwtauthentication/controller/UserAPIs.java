package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.UserRepo;
import com.grokonez.jwtauthentication.security.jwt.JwtProvider;
import com.grokonez.jwtauthentication.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserAPIs {
	@Autowired
	private JwtProvider jwtProvider;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepo userRepo;
	@GetMapping("/api/test/user")
	 @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contents!";
	}

//	@PostMapping("/api/test/add")
//	// @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//	public String addsmth(@RequestBody String smth) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		String currentPrincipalName = authentication.getName();
//		User currentUser =  this.userRepository.findByUsername(currentPrincipalName).get();
//		currentUser.setSmth(smth);
//		userRepository.save(currentUser);
//		return ">>> the thing is added!";
//	}

//
//	@GetMapping("/api/test/pm")
//	//@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
//	public String projectManagementAccess() {
//		return ">>> Board Management Project";
//	}
//
//	@GetMapping("/api/test/admin")
//	//@PreAuthorize("hasRole('ADMIN')")
//	public void adminAccess() {
//		// return ">>> Admin Contents";
//		System.out.println("Admin Contentsx	");
//	}

	@GetMapping("/info")
	public User getUserInfo(@RequestHeader("Authorization") String token) {
		System.out.println("inside the infoooooo");
//		String info = jwtProvider.getUserNameFromJwtToken(token);
		token = token.split(" ")[1];
		String username = jwtProvider.getUserNameFromJwtToken(token);
		System.out.println("the information:" + username );
		User user =  userService.getUserByUsername(username);
		System.out.println(user.getPassword());
		return user;
	}


	@PutMapping("/edit/{id}")
	public void updateUser( @RequestBody User user,@PathVariable(value = "id") String id) {
		System.out.println("inside the edit");
//		String info = jwtProvider.getUserNameFromJwtToken(token);
		// token = token.split(" ")[1];
		this.userService.updateUser(user,id);
		System.out.println("User update succefully");
	};

}