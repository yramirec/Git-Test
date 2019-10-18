package com.everis.service;

import com.everis.model.Student;
import reactor.core.publisher.Flux;

public interface StudentService {
	
	public Flux<Student> findAll();
	//Metodos abstractos
}
