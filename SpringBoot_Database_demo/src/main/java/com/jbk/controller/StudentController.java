package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/saveData")
	public String insertData(@RequestBody Student s) {
		String msg=service.insertData(s);
		return msg;
	}
	@DeleteMapping("/deleteData/{std_id}")
	public String deleteData(@PathVariable int std_id) {
		String msg=service.deleteData(std_id);
		return msg;
		
	}
	@PutMapping("/updateData/{std_id}")
	
	public String updateData(@RequestBody Student s, @PathVariable int std_id) {
		String msg=service.updateData(s, std_id);
		return msg ;
	}
	@GetMapping("/getSingleData")
	public Student getSingleData(@RequestParam int std_id) {
		Student s=service.getSingleData(std_id);
		return s;
	}
	@GetMapping("/getAllRecord")
	public List<Student> getAllRecord() {
		List <Student> list=service.getAllRecord();
		return list;
	}

	
	
	

}
