package com.bhoomi.awsemployee.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.bhoomi.awsemployee.entity.Employee;
/**
 * JPA for Employee table
 * 
 * @filename EmployeeRepository.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@EnableScan
public interface EmployeeRepository extends CrudRepository<Employee, String>{
}
