package springAopDemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class userDaoAspect {
	
	@Pointcut("execution(String saveUser())")
	void pointCut() {}
	
	@AfterReturning(pointcut ="pointCut()"
			,returning="result")
	public void afterSaveMethod(String result) {
		System.out.println("after return");
	}
}
