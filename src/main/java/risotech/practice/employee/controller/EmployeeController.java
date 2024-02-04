package risotech.practice.employee.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	@GetMapping(value = "/")
	public String list(Model model) {
		model.addAttribute("message", "Hello World");
		model.addAttribute("now", LocalDateTime.now());
		return "employee-list";
	}
}
