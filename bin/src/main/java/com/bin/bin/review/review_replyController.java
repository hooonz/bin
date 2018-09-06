package com.bin.bin.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class review_replyController {

	@Autowired
	review_replyDAO dao;
	
	@RequestMapping ("/review_replyView.do")
	static ModelAndView review_replyView() {
		ModelAndView mav=new ModelAndView();
		return mav;
	}
}
