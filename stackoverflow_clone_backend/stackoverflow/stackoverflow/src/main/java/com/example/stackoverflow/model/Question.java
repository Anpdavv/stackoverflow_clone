package com.example.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	int id;
	
	String question_body;
	
	int is_ans;

	public Question() {
		
	}
	
	public Question(int id, String question_body, int is_ans) {
		this.id = id;
		this.question_body = question_body;
		this.is_ans = is_ans;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion_body() {
		return question_body;
	}

	public void setQuestion_body(String question_body) {
		this.question_body = question_body;
	}

	public int getIs_ans() {
		return is_ans;
	}

	public void setIs_ans(int is_ans) {
		this.is_ans = is_ans;
	}
	
	
	
	

}
