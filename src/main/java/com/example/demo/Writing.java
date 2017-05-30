package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Greeting;

@Controller
public class Writing {
	
	@RequestMapping("/")
	public @ResponseBody String index(){
		return "mnist.html";
	}
	
	@PostMapping("/page")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
    	System.err.println(greeting.getLri());
        return "mnist.html";
    }
	
}


/*
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
    	System.err.println(greeting.getContent());
        return "result";
    }
*/