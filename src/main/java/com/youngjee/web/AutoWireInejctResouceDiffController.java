package com.youngjee.web;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youngjee.domain.InjectSampleDTO;

@Controller
public class AutoWireInejctResouceDiffController {

/*
    @Autowired
    	Spring Framework���� �����ϴ� Dependency ���� �뵵�� Annotation����, Spring Framework�� �������̱� ������ ������ Dependency Injection�� �ʿ��� ��쿡 �����ϴ�.
    	�������, setter �޼ҵ�, ������, �Ϲ� �޼ҵ忡 ���� ����

    @Resource
    	JSR-250 ǥ�� Annotation���� Spring Framework 2.5.* ���� �����ϴ� Annotation�̴�. @Resource�� JNDI ���ҽ�(datasource, java messaging service destination or environment entry)�� �������� ������ �� ������, Ư�� Bean�� JNDI ���ҽ��� ���� Injection�� �ʿ�� �ϴ� ��쿡�� @Resource�� ����� ���� �����Ѵ�.
    	�������, setter �޼ҵ忡 ���밡��

    @Inject
    	JSR-330 ǥ�� Annotation���� Spring 3 ���� �����ϴ� Annotation�̴�. Ư�� Framework�� ���ӵ��� ���� ���ø����̼��� �����ϱ� ���ؼ��� @Inject�� ����� ���� �����Ѵ�. @Inject�� ����ϱ� ���ؼ��� Ŭ���� �н� ���� JSR-330 ���̺귯���� javax.inject-x.x.x.jar ������ �߰��Ǿ�� �Կ� �����ؾ� �Ѵ�. 
		 �������, setter �޼ҵ�, ������, �Ϲ� �޼ҵ忡 ���� ����
	
	@Autowired, @Resource, @Inject�� ��������� ���� �����ϴ� ��� ���� setter �޼ҵ�� �������� �ʾƵ� �ȴ�. 

 */
	
	
//	@Autowired
//	@Resource
	@Inject
	InjectSampleDTO injectSampleDTO;
	
	
	private static Logger logger = LoggerFactory.getLogger(AutoWireInejctResouceDiffController.class);
	
	@RequestMapping("/AutoWireInejctResouceDiffController")
	@ResponseBody
	public String getVariousInjectTest() {
		logger.info("CALL getVariousInjectTest !!!!");
		return injectSampleDTO.getTitle();
	}

}
