package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	@GetMapping("/user")
	public String getName() 
	{
		return "HelloWord";
		
	}
	
	

}
