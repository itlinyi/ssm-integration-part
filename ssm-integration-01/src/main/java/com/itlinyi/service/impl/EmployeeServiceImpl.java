package com.itlinyi.service.impl;

import com.itlinyi.mapper.EmployeeMapper;
import com.itlinyi.pojo.Employee;
import com.itlinyi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 林一
 * @version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        return employeeMapper.queryList();
    }
}
