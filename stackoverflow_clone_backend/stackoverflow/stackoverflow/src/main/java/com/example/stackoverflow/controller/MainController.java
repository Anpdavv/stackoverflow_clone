package com.example.stackoverflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stackoverflow.Repository.AnswerRepo;
import com.example.stackoverflow.Repository.QuestionRepo;
import com.example.stackoverflow.model.Answer;
import com.example.stackoverflow.model.Question;

@RestController
public class MainController {
	
	
	@Autowired
	QuestionRepo questionRepo;
	
	@Autowired
	AnswerRepo answerRepo;
	
	@GetMapping("/question")
	public List<Question> showQuestion(){
		return questionRepo.findAll();
	}
	
	@GetMapping("/ans/{qid}")
	public List<Answer> showAnswer(@PathVariable int qid){
		return answerRepo.getAnswerById(qid);
	}
	

}
