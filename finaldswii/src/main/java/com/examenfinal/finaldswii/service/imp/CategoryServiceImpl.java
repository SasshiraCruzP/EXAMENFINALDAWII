package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Category;
import com.examenfinal.finaldswii.repo.CategoryRepo;
import com.examenfinal.finaldswii.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    private CategoryRepo categoryRepo;

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	

}
