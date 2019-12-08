package com.app.interview.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer interviewId;
    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questions;
    private String companyName;
    private Date interviewDate;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
