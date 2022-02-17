package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")
public class DemoController {

	
 	    @RequestMapping(value="/demo", method=RequestMethod.GET)
	    public String demo()
	    {
	        // The html file name is helloWorldPage.html.
 	    	System.out.println("Hi");
	        return "helloWorldPage";
	    }
	
}
