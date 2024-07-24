package com.example.demo.unsolid;

public interface IEmployeeRepository {

    public Employee[] employees;

    void addEmployee(String name);

    void removeEmployee(String name);

    Employee getEmployee(String name);
}
