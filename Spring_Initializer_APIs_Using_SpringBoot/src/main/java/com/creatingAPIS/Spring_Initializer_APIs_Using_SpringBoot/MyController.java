package com.creatingAPIS.Spring_Initializer_APIs_Using_SpringBoot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ToDoList")
public class MyController {
	
	@GetMapping("/home")
	public String FirstAPIs() {
		
		return "Welcome To The  your To-Do-List";
	}
	
	@PostMapping("/taskinsert")
	public String SecondAPIs() {
		return "Now we are inserting your daily task here";
	}
	
	@PutMapping("/taskupdate")
	public String ThirdAPIs(){
		return "In this API We are Updating the Information here";	
	}
	@DeleteMapping("/taskdelete")
	public String FourthAPIs() {
		return "In This We will deleting  the completed task here ";
	}

}
