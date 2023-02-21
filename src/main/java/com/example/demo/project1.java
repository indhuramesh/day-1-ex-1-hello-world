package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project1 {
	@GetMapping("/nand")
	public String hello() {
	return "hello world";
}
}
