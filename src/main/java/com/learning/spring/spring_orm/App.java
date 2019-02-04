package com.learning.spring.spring_orm;

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
       empDao.saveEmployee(new Employee(203, "Goerge Harrison", 57000));
    }
}
