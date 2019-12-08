package com.app.interview.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;
	private String fullQuestion;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getFullQuestion() {
		return fullQuestion;
	}

	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}
}
