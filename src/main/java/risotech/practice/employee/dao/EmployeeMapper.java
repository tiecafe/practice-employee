package risotech.practice.employee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import risotech.practice.employee.entity.Employee;

@Mapper
public interface EmployeeMapper {
	public List<Employee> findAll();
}
