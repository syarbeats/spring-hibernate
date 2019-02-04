package com.learning.spring.spring_orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.spring_orm.entity.Employee;


public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
