package com.youngjee.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.youngjee.domain.ProductVO;

@Controller
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/doA")
	public void doA() {
		logger.info("doA call.....................");
	}

	@RequestMapping("/doB")
	private void doB() {
		logger.info("doB...............");
	}
	
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg) {
		
		logger.info("doC................");
		return "result";
		
	}
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		ProductVO productVO = new ProductVO("sample product",3000);
		
		model.addAttribute(productVO);
		
		return "productDetail";
	}

	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doe called but redirect to doF............");
		
		rttr.addFlashAttribute("msg","This is the Message!!");
		
		return "redirect:doF";
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute("msg") String msg) {
		logger.info("doF called..................."+msg);
		
	}
	
}
