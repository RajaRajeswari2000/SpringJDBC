package com.springframework.springJDBC;

import java.util.List;

public interface EmployeeInterface {
	void create(Employee employee);

	void update(Employee employee);

	void delete(int id);

	List<Employee> read();
}
