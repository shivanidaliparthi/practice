package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private final AppInfoServic appInfoService;
	public AppController(AppInfoServic appInfoService) {
		this.appInfoService=appInfoService;
	}
	
	@GetMapping("/info")
	public String getInfo() {
		return appInfoService.getAppInfo();
	}
}