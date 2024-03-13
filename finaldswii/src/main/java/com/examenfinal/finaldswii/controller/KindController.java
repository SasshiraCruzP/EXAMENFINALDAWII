package com.examenfinal.finaldswii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfinal.finaldswii.model.Kind;
import com.examenfinal.finaldswii.service.KindService;

@RestController
@RequestMapping("/kindes")
public class KindController {
	@Autowired
    private KindService kindService;

    @GetMapping
    public List<Kind> getAllKindes(){
        return kindService.getAllKindes();
    }
}
