package com.example.demo.unsolid;

public class EmployeeManager implements IEmployeeOperations {

    public IEmployeeRepository employees;

    //constructor
    public EmployeeManager(IEmployeeRepository employees) {
		this.employees = employees;
	}

    public void addEmployee(String name) {
        // Agregar empleado
    }

    public void removeEmployee(String name) {
        // Eliminar empleado
    }
}
