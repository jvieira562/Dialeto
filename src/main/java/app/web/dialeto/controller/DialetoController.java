package app.web.dialeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class DialetoController {
	
	ModelAndView modelAndView = new ModelAndView();

	@RequestMapping("/")
	public ModelAndView index() {
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
	modelAndView.setViewName("login");
	return modelAndView;
	}
	
}
