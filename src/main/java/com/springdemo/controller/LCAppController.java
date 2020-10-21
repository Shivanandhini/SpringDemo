package com.springdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String showResultPage(@Valid @ModelAttribute("userdto") UserDTO userdto, BindingResult result) {

		System.out.println(userdto.isTermsAndConditions());
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}

		return "Result-page";

	}
}
