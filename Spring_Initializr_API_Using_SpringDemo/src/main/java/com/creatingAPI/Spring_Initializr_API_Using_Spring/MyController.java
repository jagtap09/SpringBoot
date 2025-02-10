package com.creatingAPI.Spring_Initializr_API_Using_Spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JBK")
public class MyController {
	@RequestMapping(value="/first" ,method=RequestMethod.GET)
	//creating API using The Spring 
	
	public  String FirstAPI() {
		return "welcome to JAVA BY KIRAN .....";
	}
	
	@RequestMapping(value="/second",method=RequestMethod.POST)
	public String SecondAPI() {
		return "Welcome To The kiran Academy...";
	}
	
	//localhost:8080/JBK/third

	@RequestMapping(value="/third",method=RequestMethod.PUT)
	public String ThirdPI() {
		return "Welcome To The Java By Kiran It Coaching.....";
	}
	
	
	@RequestMapping(value="/fourth",method=RequestMethod.DELETE)
	public String FourthAPI() {
		return " Data will be delete like Welcome To The kiran Academy...";
	}
	

}
