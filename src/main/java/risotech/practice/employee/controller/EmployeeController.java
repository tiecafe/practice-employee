package risotech.practice.employee.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import risotech.practice.employee.entity.Employee;
import risotech.practice.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/")
	public String list(Model model) {
		model.addAttribute("message", "Hello World");
		model.addAttribute("now", LocalDateTime.now());
		List<Employee> list = employeeService.findAll();
		model.addAttribute("list", list);
		return "employee-list";
	}
}
