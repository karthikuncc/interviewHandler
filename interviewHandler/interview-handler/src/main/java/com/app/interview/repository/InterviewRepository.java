package com.app.interview.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.interview.model.Interview;

@Repository
public class InterviewRepository {
	private InterviewDBRepository interviewDBRepository;

	@Autowired
	public InterviewRepository(InterviewDBRepository interviewDBRepository) {
		this.interviewDBRepository = interviewDBRepository;
	}

	public List<Interview> getInterviews() {
		return (List<Interview>) interviewDBRepository.findAll();
	}
}
