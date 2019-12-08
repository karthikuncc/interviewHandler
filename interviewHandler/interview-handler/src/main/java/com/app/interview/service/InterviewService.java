package com.app.interview.service;

import com.app.interview.model.Interview;
import com.app.interview.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

	private InterviewRepository interviewRepository;

	@Autowired
	public InterviewService(InterviewRepository interviewRepository) {
		this.interviewRepository = interviewRepository;
	}

	public List<Interview> getInterviews() {
		return interviewRepository.getInterviews();
	}
}
