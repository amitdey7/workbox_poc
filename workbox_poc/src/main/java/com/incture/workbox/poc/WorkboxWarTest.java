package com.incture.workbox.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkboxWarTest{
  
	@RequestMapping(value="/test")
	public String test(){
		return "test";
	}
}
