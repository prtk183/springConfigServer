package com.sconfig.SpringConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/hit")
@RestController
public class MyMessage {

	@Value("${email:pratyush@bluemail.com}")
	private  String email;
	
	
	@GetMapping("/getemail")
	public  String getemail()
	{
	
		
		return email;
	}
}
