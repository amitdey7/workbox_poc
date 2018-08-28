package com.incture.workbox.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkboxWarTest{
  
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public TestDto test(){

        TestDto testDto = new TestDto();
        testDto.setName("Test");
        return testDto;
	}
}
