package springAopDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {

	public String saveUser() {
		return "done";
	}

}
