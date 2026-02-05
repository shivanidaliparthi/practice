package com.example.demo;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
private final EmployeeDao employeeDao;
public EmployeeController(EmployeeDao employeeDao) {
	this.employeeDao=employeeDao;
}
@GetMapping("/employees")
public List<Employee> getEmployees(){
	return employeeDao.getallEmployees(); 
}
}
