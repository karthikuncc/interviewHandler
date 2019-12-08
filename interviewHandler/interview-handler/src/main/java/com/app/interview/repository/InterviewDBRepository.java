package com.app.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.interview.model.Interview;

public interface InterviewDBRepository extends JpaRepository<Interview, Integer> {

}
