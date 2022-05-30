package com.example.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	int id;
	
	int qid;
	
	String ans_body;
	
	public Answer() {
		
	}

	public Answer(int id, int qid, String ans_body) {
		this.id = id;
		this.qid = qid;
		this.ans_body = ans_body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getAns_body() {
		return ans_body;
	}

	public void setAns_body(String ans_body) {
		this.ans_body = ans_body;
	}
	
	

}
