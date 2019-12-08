package com.app.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.interview.model.Interview;
import com.app.interview.service.InterviewService;

@RestController
public class HomeController {
	private InterviewService interviewService;

	@Autowired
	public HomeController(InterviewService interviewService) {
		this.interviewService = interviewService;
	}

	@RequestMapping(value = "/interviews", method = RequestMethod.GET)
	public List<Interview> interviews() {
		return interviewService.getInterviews();
	}
}
