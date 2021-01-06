package com.qingao.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctr2 {
	
	@RequestMapping("/cc")
	public String cc(){
		return "嘿嘿";
	}
}
