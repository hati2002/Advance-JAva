package com.onetomany.ManyMap;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	@Column(name = "ques_Id")
	private int questionId;
	private String questions;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	public Question(int questionId, String questions, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.questions = questions;
		this.answers = answers;
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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questions=" + questions + ", answers=" + answers + "]";
	}
	
	
}
