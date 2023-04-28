package springAopDemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class userDaoAspect {
	
	@Pointcut("execution(public void save*() )")
	void pointCut() {}
	
	@Before("pointCut()")
	public void beforeSaveMethod() {
		System.out.println("Before save method from aop");
	}
}
