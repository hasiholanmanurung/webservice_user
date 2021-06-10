package com.example.rest.greeting.controller;

import java.util.List;

import com.example.rest.greeting.entity.UserRole;
// import com.example.rest.greeting.entity.UserRoleView;
// import com.example.rest.greeting.entity.Users;
import com.example.rest.greeting.service.UserroleService;

import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/userrole")
public class UserroleController {
    private final UserroleService userroleService;
    
    public UserroleController(UserroleService userroleService) {
        this.userroleService = userroleService;
    }

    @GetMapping("/get")
    public List<UserRole> getUsers() {
    	return userroleService.getAll();
    }

    // @GetMapping("/get_by_userid/{userID}")
    // public UserRole getRoleByUserId(@PathVariable final Long userId) {
    // 	return userroleService.getRoleByUserId(userId);
    // }
    // @GetMapping("/get/{name}")
    // public UserRole getUser(@PathVariable final String name) {
    // 	return userroleService.getUserByName(name);
    // }
    
    // @GetMapping("/get_by_username/{userName}")
    // public UserRole getUserByUserName(@PathVariable final String userName) {
    // 	return userroleService.getUserByUserName(userName);
    // }

    // @GetMapping("/get_by_email/{email}")
    // public UserRole getUserByEmail(@PathVariable final String email) {
    // 	return userroleService.getUserByEmail(email);
    // }

    // @GetMapping("/getRole/")
    // public List<UserRoleView> getAllUserRole(){
    //     return userroleService.getAllUserRole();
    // }

    // @GetMapping("/getrole_by_userid/{userId}")
    // public UserRoleView getUserRoleByUserId(@PathVariable final Long userId){
    //     return userroleService.getUserRoleByUserId(userId);
    // }

    // @GetMapping("/getrole_by_email/{email}")
    // public UserRoleView getUserRoleByEmail(@PathVariable final String email){
    //     return userroleService.getUserRoleByEmail(email);
    // }

    // @GetMapping("/get_posts")
    // public List<Object[]> getUserPosts() {
    // 	return userroleService.getUserPosts();
    // }

    // @GetMapping("/get_posts/{userid}")
    // public List<Object[]> getUserPosts(@PathVariable final int userid) {
    // 	return userroleService.getUserPosts(userid);
    // }

    // @PostMapping("/create")
    // public void create(@RequestBody final Users users){
    // 	userroleService.createUser(users);
    // }

    // @PutMapping("/edit/{userId}")
    // public void edit(@RequestBody final Users users, @PathVariable final Long userId){
    // 	userroleService.editUser(users, userId);
    // }

    // @DeleteMapping("/delete/{userid}")
    // public void delete(@PathVariable final Long userid) {
    //     userroleService.deleteUser(userid);
    // }

    // @PutMapping("/edit_role/{roleId}")
    // public void ediRole(@RequestBody final UserRole userRole, @PathVariable final Long roleId){
    // 	userroleService.editRole(userRole, roleId);
    // }
    
    
}
