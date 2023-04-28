package springAopDemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class userDaoAspect {
	
	@Pointcut("execution(public void save*(*) )")
	void pointCut() {}
	
	@Before("pointCut()")
	public void beforeSaveMethod(JoinPoint j) {
		MethodSignature methodSignature = (MethodSignature) j.getSignature();
		System.out.println(methodSignature);
	}
}
