package com.example.demosarah1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContorller {
	
	
	@GetMapping("/home")
	public String home () {
		
		return "This is Home" ;
	}
	
	@GetMapping("/admin")
	public String admin () {
		
		return "This is Admin Page" ;
	}
 
}
