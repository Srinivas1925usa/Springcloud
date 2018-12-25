package com.motubo.feignclient.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eurekaclient")
public interface GreetingClient {
	
	@RequestMapping("/greeting")
	String greeting();
}
