package springAopDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {

	public void saveUser(String s) {
		System.out.println("Save User");
	}

}
