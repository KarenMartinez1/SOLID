package com.example.demo.unsolid;

public interface EmployeeRepository implements IEmployeeRepository{

    public EmployeeBase[] employees;

    public void addEmployee(String name) {
        // Agregar empleado
    }

    public void removeEmployee(String name) {
        // Eliminar empleado
    }

    public EmployeeBase getEmployee(String name) {
        // Obtener empleado
    }
}
