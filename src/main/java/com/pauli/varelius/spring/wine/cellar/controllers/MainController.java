package com.pauli.varelius.spring.wine.cellar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String Home(Model model) {
		return "index";
	}
}
