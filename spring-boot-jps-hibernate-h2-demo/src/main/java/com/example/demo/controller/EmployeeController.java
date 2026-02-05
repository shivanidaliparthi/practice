package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private  EmployeeService employeeService;
	 
	public EmployeeController( EmployeeService employeeService) {
		this. employeeService=employeeService;
		
	}
	
	  @GetMapping
	  public List<Employee> getAllEmployee(){
		  return employeeService.getAllEmployee();
		  
	  }
	  @GetMapping ("/employee{id}")
	  public Employee GetEmployeebyId(@PathVariable int id) {
		  return employeeService.getEmployeeById(id);
		  
	  }
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public Employee addEmployee( @RequestBody  Employee emp)
	  {
		  return employeeService.saveEmployee(emp);
		  
	  }
	  @PutMapping("/{id}")
	  public Employee updateEmployee(@PathVariable int id ,@RequestBody Employee updatedEmp) {
		  return employeeService.updateEmployeeById(id, updatedEmp);
		  
	  }
	  
	  @DeleteMapping("/{id}")
	  @ResponseStatus(HttpStatus.NO_CONTENT)
	  public void deleteEmployee(@PathVariable int id) {
		  employeeService.deleteEmployee(id);
	  }
	
}
