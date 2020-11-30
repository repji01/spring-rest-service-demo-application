package repik.learn.spring.restservicedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repik.learn.spring.restservicedemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
