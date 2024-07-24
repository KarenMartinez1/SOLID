package com.example.demo.unsolid;

public interface ISalaryCalculator {

    public IEmployeeRepository employees;

    double calculateSalary(String name, int salary);
}
