package com.example.demo.unsolid;

public interface IReportGenerator {

    public EmployeeManager employeeOperations;
    public IReport reportModule;

    void generateReport();
}
