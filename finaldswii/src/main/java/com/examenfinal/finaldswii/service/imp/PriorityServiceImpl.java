package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Priority;
import com.examenfinal.finaldswii.repo.PriorityRepo;
import com.examenfinal.finaldswii.service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService{
	
	@Autowired
    private PriorityRepo priorityRepo;

	@Override
	public List<Priority> getAllPriorities() {
		// TODO Auto-generated method stub
		return priorityRepo.findAll();
	}
	

}
