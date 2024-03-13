package com.examenfinal.finaldswii.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examenfinal.finaldswii.model.User;

public interface UserRepo  extends JpaRepository<User, Integer>  {
	
	
}
