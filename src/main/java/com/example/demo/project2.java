
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project2 {
	@GetMapping("/show")
	public String display() {
		return"hello welcome to skcet.hope you enjoy the studies";
	}
}