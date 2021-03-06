package com.ittechoffice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SampleController {
    
	@RequestMapping("/")
	public String home() {
        return "welcome";
    }
	
    public static void main(String[] args) throws Exception {
    	SpringApplication.run(SampleController.class, args);
    }

}
