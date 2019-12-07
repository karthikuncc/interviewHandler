package com.app.interview.repository;

import com.app.interview.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewDBRepository extends JpaRepository<Interview,Integer> {

}
