package com.example.Spring_Initializr_project_Demo_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController // mark as the controller class 
@RequestMapping("/APIS")
public class MyController {
	// using  spring
	@RequestMapping(value="/fisrt" ,method =RequestMethod.GET)
	public String firstAPI() {
		return "Its My First API";
		}
	// using spring boot	
	@GetMapping("/second")
	public String seconfAPI() {
		return "Its My Second API";
				
	
	}

}
