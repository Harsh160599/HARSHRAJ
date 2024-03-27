package com.EmployeeApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.EmployeeApplication.model.Employee;
@Service
public class EmployeeServiceImpl implements EmpService{
   @Autowired
	JdbcTemplate jdbcTemp;
	@Override
	public String AddEmp(Employee emp) {
		String sqlcmd="Insert into Employee(empname,job,email,pswd) values(?,?,?,?)";
        int res=jdbcTemp.update(sqlcmd, new Object[] {emp.getEmpname(),emp.getJob(),emp.getEmail() ,emp.getPswd()});
		// TODO Auto-generated method stub
        if(res>=1)
		return "Success";
        return "Error";
	}

	@Override
	public List<Employee> allEmp() {
		// TODO Auto-generated method stub
		String sqlcmdString="Select * from Employee";
		List<Employee> empall=jdbcTemp.query(sqlcmdString, new BeanPropertyRowMapper(Employee.class));
		return empall;
	}

	@Override
	public Employee SearchEmp(int empno) {
		// TODO Auto-generated method stub
		String sqlcmd="Select * from Employee where empno=?";
		Employee emp=null;
		try {
			emp =(Employee)jdbcTemp.queryForObject(sqlcmd, new Object[] {empno}, new BeanPropertyRowMapper(Employee.class));
		} catch (Exception e) {
			// TODO: handle exception
			emp=null;
		}
		return emp;
	}

}
