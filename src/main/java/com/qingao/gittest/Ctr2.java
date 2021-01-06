package com.qingao.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctr2 {
	
	private String str = "abcxyz";
	
	@RequestMapping("/cc")
	public String cc(){
		return "嘿嘿";
	}
}
