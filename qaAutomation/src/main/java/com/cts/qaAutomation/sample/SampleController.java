package com.cts.qaAutomation.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public Sample sampleMethod() {
		return new Sample(1, "This is a test string");
	}
}
