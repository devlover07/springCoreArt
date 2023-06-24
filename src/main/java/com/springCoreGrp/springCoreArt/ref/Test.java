package com.springCoreGrp.springCoreArt.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springCoreGrp/springCoreArt/ref/refconfig.xml");
		A aBean = (A) context.getBean("aref");
		System.out.println(aBean.getX());
		System.out.println(aBean.getOb());
		
		System.out.println(aBean);
	}

}
