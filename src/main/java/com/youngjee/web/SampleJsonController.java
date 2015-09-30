package com.youngjee.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youngjee.domain.ProductVO;

@Controller
public class SampleJsonController {
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("ป๙วรป๙วร", 30000);
		return vo;
	}

}
