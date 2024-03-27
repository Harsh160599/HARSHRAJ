package com.EmployeeApplication.service;

import java.util.List;

import com.EmployeeApplication.model.Employee;

public interface EmpService {
   public String AddEmp(Employee emp);
   public List<Employee> allEmp();
   public Employee SearchEmp(int empno);
}
