package com.n2s.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.n2s.main.model.LoginBean;


@Controller
public class LoginController {
	@RequestMapping({"/","/login"})
	public String login(Model m) {
		m.addAttribute("lb",new LoginBean());
		return "Login";
	}
	@RequestMapping(value = "/processlogin",method = RequestMethod.POST)
	public String loginsubmit(@ModelAttribute LoginBean lb,Model m) {
		m.addAttribute("lb",lb);
		return "welcome";
		
	}

}
