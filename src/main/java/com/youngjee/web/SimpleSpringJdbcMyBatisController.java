package com.youngjee.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.youngjee.domain.MemberVO;
import com.youngjee.domain.ProductVO;
import com.youngjee.persistence.MemberDAO;

@Controller
@RequestMapping("/simpleSpringJdbc")
public class SimpleSpringJdbcMyBatisController {
	
	private static Logger logger = LoggerFactory.getLogger(SimpleSpringJdbcMyBatisController.class);
	
	@Inject
	private MemberDAO memberDao;
	
//	http://localhost:8181/web/simpleSpringJdbc/addFlashTest
	@RequestMapping("/addFlashTest")
	public String doE(RedirectAttributes rttr) {
		logger.info("addFlashTest called but modelAttrTest to doF............");
		
		rttr.addFlashAttribute("msg","This is the Message!!");
		
		return "redirect:modelAttrTest";
	}
	
	@RequestMapping("/modelAttrTest")
	@ResponseBody
	public String doF(@ModelAttribute("msg") String msg) {
		logger.info("modelAttrTest called..................."+msg);
		return msg;
	}
	
//	http://localhost:8181/web/simpleSpringJdbc/doJSON
	@RequestMapping("/doJSON")
	@ResponseBody
	public ProductVO doJSON() {
		ProductVO vo = new ProductVO("ป๙วรป๙วร", 30000);
		return vo;
	}

//	http://localhost:8181/web/simpleSpringJdbc/getDbTime
	@RequestMapping("/getDbTime")
	@ResponseBody
	public String dbGetTime() {
		String dbTime =  memberDao.getTime();
		return dbTime;
	}

//	http://localhost:8181/web/simpleSpringJdbc/readMember?userId=user00
	@RequestMapping("/readMember")
	@ResponseBody
	public MemberVO readMember(@RequestParam("userId") String userId) throws Exception {
		logger.info("readMember >>>>>>>>>>>>>>>>>>>>>>>>>>");
		MemberVO memberVO = memberDao.readMember(userId);
		return memberVO;
	}
	
//	http://localhost:8181/web/simpleSpringJdbc/readMember/user00/useruser
	@RequestMapping("/readMember/{id}/{pw}")
	@ResponseBody
	public MemberVO readMemberWithPW(@PathVariable String id, @PathVariable String pw ) throws Exception {
		logger.info("readMemberWithPW <<<<<<<<<<<<<<<<<<<<<<<");
		MemberVO memberVO = memberDao.readWithPW(id, pw);
		return memberVO;
	}

}
