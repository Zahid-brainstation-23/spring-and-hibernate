package springAopDemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class userDaoAspect {
	
	@Before("execution(public void save*() )")
	public void beforeSaveMethod() {
		System.out.println("Before save method from aop");
	}
}
