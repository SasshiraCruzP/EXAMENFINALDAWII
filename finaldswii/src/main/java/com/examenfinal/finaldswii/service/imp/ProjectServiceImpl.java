package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Project;
import com.examenfinal.finaldswii.repo.ProjectRepo;
import com.examenfinal.finaldswii.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
    private ProjectRepo projectRepo;

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectRepo.findAll();
	}

}
