package com.example.demo.unsolid;

public interface IEmployeeOperations {

    public IEmployeeRepository employees;

    void addEmployee(String name);

    void removeEmployee(String name);
}
