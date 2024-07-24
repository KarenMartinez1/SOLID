package com.example.demo.unsolid;

public interface IEmployeeRepository {

    public EmployeeBase[] employees;

    void addEmployee(String name);

    void removeEmployee(String name);

    EmployeeBase getEmployee(String name);
}
