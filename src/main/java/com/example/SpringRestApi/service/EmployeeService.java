package com.example.SpringRestApi.service;

import java.util.List;

import com.example.SpringRestApi.model.Employee;

public interface EmployeeService {

    List<Employee> getemployees(int pageNumber, int pageSize);

    Employee saveEmployee(Employee employee);

    Employee getSingleEmployee(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee(Employee employee);

    List<Employee> getEmployeesByName(String name);

    List<Employee> getEmployeesByNameAndLocation(String name, String location);

    List<Employee> getEmployeesByNameOrLocation(String name, String location);

    Integer deleteByEmployeeName(String name);
}
