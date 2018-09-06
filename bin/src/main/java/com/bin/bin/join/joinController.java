package com.bin.bin.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class joinController {

	@Autowired
	joinDAO dao;
	@RequestMapping("/joinView.do")
	static ModelAndView joinView() {
		ModelAndView mav=new ModelAndView();
		return mav;
	}
}
