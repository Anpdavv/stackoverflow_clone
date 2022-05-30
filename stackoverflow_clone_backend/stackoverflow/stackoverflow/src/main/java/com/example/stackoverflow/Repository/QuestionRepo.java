package com.example.stackoverflow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stackoverflow.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
