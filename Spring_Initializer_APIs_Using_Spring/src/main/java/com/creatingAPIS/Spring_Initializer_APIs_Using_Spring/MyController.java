package com.creatingAPIS.Spring_Initializer_APIs_Using_Spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Travllers")
public class MyController {
	
	
	@RequestMapping(value="/home",method =RequestMethod.GET)
	public String FirstAPIs() {
		
		return "Welcome To The RedBus";
	}
	@RequestMapping(value="/infoinsert",method=RequestMethod.POST)
	public String SecondAPIs() {
		return "Now we are inserting your Infomation here";
	}
	@RequestMapping(value="/infoupdate",method =RequestMethod.PUT)
	public String ThirdAPIs(){
		return "In this API We are Updating the Information here";	
	}
	@RequestMapping(value="/infodelete",method=RequestMethod.DELETE)
	public String FourthAPIs() {
		return "In This We will deleting  the infomation here ";
	}
	
	
	

}
