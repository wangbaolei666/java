package com.qingao.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ctr {
	
	@RequestMapping("/aa")
	@ResponseBody
	public String aa(){
		return "呵呵";
	}
	
	@RequestMapping("/bb")
	@ResponseBody
	public String bb(){
		return "哈哈";
	}
}
