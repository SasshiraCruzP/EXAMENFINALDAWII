package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Status;
import com.examenfinal.finaldswii.repo.StatusRepo;
import com.examenfinal.finaldswii.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{
	
	@Autowired
    private StatusRepo statusRepo;

	@Override
	public List<Status> getAllStatuses() {
		// TODO Auto-generated method stub
		return statusRepo.findAll();
	}

}
