package com.examenfinal.finaldswii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfinal.finaldswii.model.Status;
import com.examenfinal.finaldswii.service.StatusService;

@RestController
@RequestMapping("/statues")
public class StatusController {

	@Autowired
    private StatusService statusService;

    @GetMapping
    public List<Status> getAllStatuses() {
        return statusService.getAllStatuses();
    }
}
