package com.examenfinal.finaldswii.service;

import java.util.List;

import com.examenfinal.finaldswii.model.User;

public interface UserService {
	
	List<User> getAllUsers();
	
    User getUserById(int id);
    
    User createUser(User user);
    
    User updateUser(int id, User newUser);
    
    void deleteUser(int id);
}
