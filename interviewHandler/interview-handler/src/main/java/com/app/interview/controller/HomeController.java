package com.app.interview.controller;

import com.app.interview.model.Interview;
import com.app.interview.service.InterviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HomeController {
     private InterviewService interviewService;

    public HomeController(InterviewService interviewService) {
        this.interviewService=interviewService;
    }

    @GetMapping
    public List<Interview> interviews(){
        return interviewService.getInterviews();
    }
}
