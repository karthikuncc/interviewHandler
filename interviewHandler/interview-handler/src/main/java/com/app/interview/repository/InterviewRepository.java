package com.app.interview.repository;

import com.app.interview.model.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InterviewRepository {
    private InterviewDBRepository interviewDBRepository;

    @Autowired
    public InterviewRepository(InterviewDBRepository interviewDBRepository) {
        this.interviewDBRepository=interviewDBRepository;
    }

    public List<Interview> getInterviews() {
        return interviewDBRepository.findAll();
    }
}
