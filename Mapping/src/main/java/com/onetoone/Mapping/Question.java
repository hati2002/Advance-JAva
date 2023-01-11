package com.onetoone.Mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "ques_Id")
	private int questionId;
	private String questions;
	
	@OneToOne
	private Answer answer;

	public Question(int questionId, String questions, Answer answer) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questions=" + questions + ", answer=" + answer + "]";
	}



	
	
}
