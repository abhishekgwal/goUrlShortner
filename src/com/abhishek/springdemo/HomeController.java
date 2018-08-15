package com.abhishek.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/yt")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/sf")
	public String stackOverFlowPage() {
		return "golinkpage";
	}
	
	@RequestMapping("/ccentral")
	public String choiceCentral() {
		return "choice-central";
	}
	
	@RequestMapping("/ms")
	public String micro() {
		return "microsoft";
	}

}
