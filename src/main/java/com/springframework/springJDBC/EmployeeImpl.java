package com.springframework.springJDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class EmployeeImpl implements EmployeeInterface {
	JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void create(Employee employee) {
		int result = jdbctemplate.update("insert into employee values(?,?,?)", employee.getId(),
				employee.getFirstname(), employee.getLastname());
		System.out.println(result);

	}

	@Override
	public void update(Employee employee) {
		int result = jdbctemplate.update("update employee set firstname=?,lastname=? where id=?",
				employee.getFirstname(), employee.getLastname(), employee.getId());
		System.out.println(result);

	}

	@Override
	public void delete(int id) {
		int result = jdbctemplate.update("delete from employee where id=?", id);
		System.out.println(result);

	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> query = jdbctemplate.query(sql, rowmapper);
		return query;
	}

}
