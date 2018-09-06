package com.bin.bin.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class chatController {
	@Autowired
	chatDAO dao;
	
	@RequestMapping("/chatView.do")
	static ModelAndView chatting() {
		ModelAndView mav=new ModelAndView();
		return mav;
	}
	
}
