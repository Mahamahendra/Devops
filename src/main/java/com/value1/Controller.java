package com.value1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value = "/devops")
	public String getMsg() {
		return "DevOps Config";
	}
}
