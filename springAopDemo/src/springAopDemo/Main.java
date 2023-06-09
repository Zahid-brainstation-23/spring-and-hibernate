package springAopDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springAopDemo.dao.CustomerDao;
import springAopDemo.dao.UserDao;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Config.class);

		
		CustomerDao customerDao = applicationContext.getBean("customerDao",CustomerDao.class);
		String s = customerDao.saveUser();
		System.out.println(s);
		
	} 
}
