package com.learning.spring.spring_orm.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.learning.spring.spring_orm.entity.Employee;

public class EmployeeDao extends HibernateDaoSupport{
	
	private Logger logger = Logger.getLogger(EmployeeDao.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	 
  
	@Transactional(readOnly=false)
	public void saveEmployee(Employee emp) {
		getHibernateTemplate().save(emp);
	}
	
	/*
	 * SPRING JDBC INSERT
	 * **/
	public void addEmployee(int id, String name, int salary) {
		
	}
	
	public int updateEmployee(Employee emp) {
		return 0;
	
	}
	
	public boolean isEmployeeExist(int id) {
		return false;	
	}
	
	/*
	 * SPRING JDBC - CALL MYSQL STORE PROCEDURE
	 * **/
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee(){
		return null;
		
	}
	
	/*
	 * SPRING STOREDPROCEDUE CLASS
	 * **/
	public int getEmployeeCount(){
		
		return 0;
	}
	
	/*
	 * JDBC TEMPLATE NAMED PARAMETER
	 * **/
	public void updateSalary(int employeeId, int salary) {
		
	}
	
	/*
	 * Handling binary file (BLOB) in Spring JDBC
	 * **/
	public void updateEmployeePhoto(int id, byte[] photo) {
		
	}
	
	/*
	 * Handling Character Large Object (CLOB) in Spring JDBC
	 * **/
	public void updateEmployeWorkingHistory(int id, String workingHistory) {
		
	}
	
	/*
	 * BATCH UPDATE IN SPRING JDBC
	 * **/
	public void batchUpdateEmployee(List<Employee> emp) {
			
	}
	
	public int deleteEmployee(Employee emp) {
		
		return 0;
	}

	/*
	 * JDBC TEMPLATE ROW MAPPER
	 * */
	public List<Employee> getListEmployee() {
		return null;
	}

	/*
	 * JDBC TEMPLATE RESULT SET EXTRACTOR
	 * */
	public List<Employee> getListEmployees(){
		return null;
		
	}
	
	/*
	 * JDBC TEMPLATE PREPARED STATEMENT
	 * */
	public List<Employee> getEmployeeData(int id) {
		return null;
		
	}

}
