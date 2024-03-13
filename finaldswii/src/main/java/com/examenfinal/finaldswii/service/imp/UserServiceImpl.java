package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.User;
import com.examenfinal.finaldswii.repo.UserRepo;
import com.examenfinal.finaldswii.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepo userRepo;


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElse(null);
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUser(int id, User newUser) {
		// TODO Auto-generated method stub
		User userA = userRepo.findById(id).orElse(null);
        if (userA != null) {
            // Actualizar los datos del usuario existente con los nuevos datos
        	userA.setUsername(newUser.getUsername());
        	userA.setName(newUser.getName());
        	userA.setLastname(newUser.getLastname());
        	userA.setEmail(newUser.getEmail());
        	userA.setPassword(newUser.getPassword());
        	userA.setIs_active(newUser.getIs_active());
        	userA.setKind(newUser.getKind());
            return userRepo.save(userA);
        } else {
            return null;
        }
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

}
