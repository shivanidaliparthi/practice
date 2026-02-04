package com.example.demo;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
  private final JdbcTemplate jdbcTemplate;
  
  public EmployeeDao(JdbcTemplate jdbcTemplate) {
	  this.jdbcTemplate =jdbcTemplate;
  }
  public List<Employee> getallEmployees(){
	  String sql= "Select* from Employee";
	  return jdbcTemplate.query(sql,new EmployeeRowMapper());
  }
}
