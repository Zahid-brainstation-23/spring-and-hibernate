package springAopDemo.aspect;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	public void saveUser() {
		System.out.println("Save User");
	}

}
