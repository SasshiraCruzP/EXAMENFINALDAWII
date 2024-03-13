package com.examenfinal.finaldswii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfinal.finaldswii.model.Priority;
import com.examenfinal.finaldswii.service.PriorityService;

@RestController
@RequestMapping("/priority")
public class PriorityController {

	@Autowired
    private PriorityService priorityService;

    @GetMapping
    public List<Priority> getAllPriorities() {
        return priorityService.getAllPriorities();
    }
}
