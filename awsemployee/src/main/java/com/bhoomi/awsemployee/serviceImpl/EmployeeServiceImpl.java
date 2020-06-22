package com.bhoomi.awsemployee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhoomi.awsemployee.entity.Employee;
import com.bhoomi.awsemployee.repository.EmployeeRepository;
import com.bhoomi.awsemployee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{	

	@Autowired
	EmployeeRepository empRepository;
	

	public List<Employee> getAllEmployees() {
		List<Employee> empData = (List<Employee>) empRepository.findAll();
		return empData;
	}


	@Override
	public String addEmployee(Employee e) {
		empRepository.save(e);
		return e.getId();
	}

}
