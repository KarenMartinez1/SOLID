package com.example.demo.unsolid;

public class SalaryCalculator {

    public IEmployeeRepository employees;

    //constructor
    public SalaryCalculator(IEmployeeRepository employees) {
		this.employees = employees;
	}

    public double calculateSalary(String name, int salary) {
        //Calcular el salario
        return 0.0;
    }
}
