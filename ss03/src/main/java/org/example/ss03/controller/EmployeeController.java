package org.example.ss03.controller;

import org.example.ss03.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
public class EmployeeController {
    @RequestMapping(value="/eemploye",method= RequestMethod.GET)

    public String showEmployee(Model model) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Nguyen Quang Vinh","Phong mkt",1000000000));
        employees.add(new Employee(2,"Hoang Van Luong","phong it",12345));
        employees.add(new Employee(3,"Hoang Cung Cat","phong bao ve",1092910934));
        model.addAttribute("employees",employees);
        return "employee";


    }
}
