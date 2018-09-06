package com.bin.bin.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class business_adController {
	@Autowired
	business_adDAO dao;
	
	@RequestMapping("/business_adView.do")
	static ModelAndView business_adView() {
		ModelAndView mav=new ModelAndView();
		return mav;
	}
}
