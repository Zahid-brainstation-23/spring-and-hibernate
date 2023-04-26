package springAopDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public void saveUser() {
		System.out.println("Save User");
	}

}
