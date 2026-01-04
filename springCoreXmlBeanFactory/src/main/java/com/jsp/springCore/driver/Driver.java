package com.jsp.springCore.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jsp.springCore.entity.Computer;

public class Driver {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("myConfig.xml");
		BeanFactory bFactory=new XmlBeanFactory(resource);
		
		Computer bean = bFactory.getBean(Computer.class);
		Computer bean1 = bFactory.getBean(Computer.class);
		System.out.println(bean);
		System.out.println(bean1);
		
		
		
	}
}
