package com.example.rest.greeting.service;

import java.util.List;

import com.example.rest.greeting.entity.UserRole;
// import com.example.rest.greeting.entity.UserRoleView;
// import com.example.rest.greeting.entity.Users;
import com.example.rest.greeting.repository.UserRoleRepository;
// import com.example.rest.greeting.repository.UserRoleViewRepository;
// import com.example.rest.greeting.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserroleService {
    // @Autowired
	// private UsersRepository userRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;

	// @Autowired
	// private UserRoleViewRepository userRoleViewRepository;

    public List<UserRole> getAll(){
		return userRoleRepository.findAll();
	}

    // public Users getUserByName(String name) {		
	// 	return userRepository.getUserByName(name).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User [name=" + name + "] is not found!"));
	// }

	// public Users getUserByUserName(String userName) {
	// 	return userRepository.findByusername(userName).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User [name=" + userName + "] is not found!"));
	// }

    // public Users getUserByEmail(String email) {
    //     return userRepository.findByEmail(email).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User by email [" + email + "] is not found!"));
    // }

	// public UserRoleView getUserRoleByUserId(Long userId){
	// 	return userRoleViewRepository.getUserRoleByuserid(userId).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User Role not found!"));
	// }

    // public UserRoleView getUserRoleByEmail(String email) {
    //     return userRoleViewRepository.getUserRoleByEmail(email).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User Role not found!"));
    // }

	// public List<UserRoleView> getAllUserRole() {
	// 	if(userRoleViewRepository.getAllUserRole().isEmpty()) {
	// 		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No single User Role found!");
	// 	}

	// 	return userRoleViewRepository.getAllUserRole();
	// }

	// public List<Object[]> getUserPosts() {
	// 	if (!userRepository.getAllUserPosts().isEmpty()) {
	// 		return userRepository.getAllUserPosts();
	// 	}
	// 	else 
	// 		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No User post was found!");
	// }

	// public List<Object[]> getUserPosts(int userid) {
	// 	if (!userRepository.getAllUserPosts(userid).isEmpty()) {
	// 		return userRepository.getAllUserPosts(userid);
	// 	}
	// 	else 
	// 		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No User post was found!");
	// }

	// public void createUser(Users users) {
	// 	if (userRepository.getUserByName(users.getUsername()).isPresent()) {
	// 		throw new ResponseStatusException(HttpStatus.CONFLICT, "UserName is already exist!");
	// 	};

	// 	userRepository.save(users);

	// 	throw new ResponseStatusException(HttpStatus.OK, "User " + users.getUsername() + " successfully created!");
	// }

	// public Users editUser(Users users, Long userId) {
	// 	userRepository.findById(userId).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User not found!"));

	// 	userRepository.save(users);
		
	// 	throw new ResponseStatusException(
	// 		HttpStatus.OK, "User successfully updated!");
	// }

    // public void deleteUser(Long userid) {
	// 	userRepository.findById(userid).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User not found!"));
		
	// 	userRepository.deleteById(userid);

	// 	throw new ResponseStatusException(HttpStatus.OK, "User succesfully removed!");
    // }

	// public void editRole(UserRole userRole, Long roleId) {
	// 	userRoleRepository.findById(roleId).orElseThrow(() -> new ResponseStatusException(
	// 		HttpStatus.NOT_FOUND, "User Role not found!"));

	// 	userRoleRepository.save(userRole);

	// 	throw new ResponseStatusException(HttpStatus.OK, "User Role succesfully Updated!");
	// }
    
}
