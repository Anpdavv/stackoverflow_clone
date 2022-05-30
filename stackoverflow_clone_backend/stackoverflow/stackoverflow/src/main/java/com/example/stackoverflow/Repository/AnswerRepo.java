package com.example.stackoverflow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.stackoverflow.model.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer>{
	
	@Query("SELECT u FROM Answer u WHERE u.qid = ?1")
	public List<Answer> getAnswerById(int qid);
	

}
