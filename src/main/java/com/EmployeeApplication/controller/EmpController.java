package com.EmployeeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EmployeeApplication.model.Employee;
import com.EmployeeApplication.service.EmpService;
@Controller
public class EmpController {
	@Autowired
	EmpService eService;
	@GetMapping("/newemp")
public String  NewEmp(Model m)
{
	m.addAttribute("emp", new Employee());
	return "AddEmp";
}
	@PostMapping("/newempinfo")
	public String NewEmp(@ModelAttribute Employee emp, Model m)
	{
		String reString=eService.AddEmp(emp);
		if(reString.equals("Success"))
		{
			m.addAttribute("info","Employee is Added");
			m.addAttribute("emp", new Employee());
		}
		return "redirect:/empall";
	
	}
	@GetMapping("/empall")
	public String ViewAll(Model m)
	{
		List<Employee> emplist=eService.allEmp();
		m.addAttribute("emplist",emplist);
		return  "ViewEmp";
		
	}
	@GetMapping("/semp")
	public String SearchEmp(Model m)
	{
		return "SearchEmp";
	}
	@PostMapping("/sempinfo")
	public String SearchEmp(@RequestParam("txtEmpno") int eno, Model m)
	{
		Employee einfo=eService.SearchEmp(eno);
		
		if(einfo!=null)
			m.addAttribute("einfo",einfo);
		else 
			m.addAttribute("info","Employee not found");
			
		return "SearchEmp";
			
	}
	
}

