package com.timeyang;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author chaokunyang
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
