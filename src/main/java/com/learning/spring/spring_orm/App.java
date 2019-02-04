package com.learning.spring.spring_orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.spring.spring_orm.dao.EmployeeDao;
import com.learning.spring.spring_orm.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx =  new ClassPathXmlApplicationContext("META-INF/application-context.xml");
       EmployeeDao empDao = (EmployeeDao) ctx.getBean("empDao");
       empDao.saveEmployee(new Employee(204, "Ringgo Start", 57000));
       empDao.updateEmployeeName(204, "Ringgo Star");
       Employee emp = empDao.getEmployeeData(204);
       System.out.println("Employee:"+emp.getName()+" ,Salary: "+emp.getSalary());
       List<Employee> empList = empDao.getListEmployee();
       
       for(Employee employee:empList) {
    	   System.out.println("Employee:"+employee.getName()+", Salary:"+employee.getSalary());
       }
    }
}
