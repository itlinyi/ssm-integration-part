package com.itlinyi.mapper;

import com.itlinyi.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 林一
 * @version 1.0
 */
public interface EmployeeMapper {
    List<Employee> queryList();

}
