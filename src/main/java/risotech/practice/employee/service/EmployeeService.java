package risotech.practice.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import risotech.practice.employee.entity.Employee;

import risotech.practice.employee.dao.EmployeeMapper;

@Service
public class EmployeeService {
	EmployeeMapper employeeDao;

	public EmployeeService(EmployeeMapper employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
}
