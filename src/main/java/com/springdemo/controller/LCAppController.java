package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.model.UserDTO;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userdto") UserDTO userdto) {

		return "home-page";

	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@ModelAttribute("userdto") UserDTO userdto) {

		return "Result-page";

	}
}
