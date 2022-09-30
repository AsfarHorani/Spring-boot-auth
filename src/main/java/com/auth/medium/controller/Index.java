package com.auth.medium.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Index {
	// index
		@GetMapping("/")
		public String home() {
			return "Welcome";
		}
}