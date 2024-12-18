package com.example.sample1.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg1", "    ∩∩");
		mav.addObject("msg2", "   （´･ω･）");
		mav.addObject("msg3", "   ＿| ⊃／(＿＿_");
		mav.addObject("msg4", " ／ └-(＿＿＿_／");
		mav.addObject("msg5", " ￣￣￣￣￣￣￣");
		return mav;
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView form(ModelAndView mav) {
		mav.setViewName("other");
		mav.addObject("msg1", "    ⊂⌒／ヽ-、＿_");
		mav.addObject("msg2", " ／⊂_/＿＿＿＿ ／");
		return mav;
		
	}
}
