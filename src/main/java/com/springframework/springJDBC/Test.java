package com.springframework.springJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springframework/springJDBC/NewFile.xml");
		 EmployeeImpl implementation = (EmployeeImpl) context.getBean("employeeImp");
		/*Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstname("RajaRajeswari");
		employee.setLastname("sakthivel");
		implementation.create(employee);
		//implementation.update(employee);*/
		//implementation.delete(3);
		// JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbctemplate");
		// int result=jdbctemplate.update("insert into employee
		// values(1,'raji','rajeswari')");
		// int result = jdbctemplate.update("insert into employee values(?,?,?)", 3,
		// "raja","rajeshwari");

		// System.out.println(result);
		List<Employee> result = implementation.read();
		System.out.println(result);
			}

}
