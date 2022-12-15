package CRUD_Restful_API.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CRUD_Restful_API.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
