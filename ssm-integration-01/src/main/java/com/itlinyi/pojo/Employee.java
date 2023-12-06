package com.itlinyi.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;


@Data
@Repository
public class Employee {

    private Integer empId;
    private String empName;
    private Double empSalary;
}