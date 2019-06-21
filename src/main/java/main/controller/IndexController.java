package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value="/main/index", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("display", "/main/index.jsp");
		mav.setViewName("/main/index");
		return mav;
	}
	  
   @RequestMapping(value="/serviceImg.do", method = RequestMethod.GET)
   public String serviceImg() {
      return "/main/serviceImg";
   }
   
   @RequestMapping(value="/sendEmail", method = RequestMethod.GET)
   public String sendEmail() {
      return "/main/sendEmail";
   }
   @RequestMapping(value="/servicePrivate", method = RequestMethod.GET)
   public String servicePrivate() {
      return "/main/servicePrivate";
   }
   @RequestMapping(value="/serviceAgreement", method = RequestMethod.GET)
   public String serviceAgreement() {
      return "/main/serviceAgreement";
   }
	
		
}
