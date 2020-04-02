package com.rtpl.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("empdao");  
	    int status=dao.saveEmployee(new Employee(104,"Amit",35000));  
	    System.out.println(status);  
}
}