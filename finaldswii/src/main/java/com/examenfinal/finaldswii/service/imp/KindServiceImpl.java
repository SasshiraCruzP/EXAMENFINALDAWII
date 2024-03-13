package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Kind;
import com.examenfinal.finaldswii.repo.KindRepo;
import com.examenfinal.finaldswii.service.KindService;

@Service
public class KindServiceImpl implements KindService{
	
	@Autowired
    private KindRepo kindRepo;

	@Override
	public List<Kind> getAllKindes() {
		// TODO Auto-generated method stub
		return kindRepo.findAll();
	}

}
