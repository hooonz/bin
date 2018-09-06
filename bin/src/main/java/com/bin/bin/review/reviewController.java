package com.bin.bin.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class reviewController {
	@Autowired
	reviewDAO dao;
	
	@RequestMapping("/review.do")
	static ModelAndView review() {
		ModelAndView mav=new ModelAndView();
		mav.getViewName();   //괄호안에 리뷰 뷰 url 넣기 
		return mav;
	}
}
