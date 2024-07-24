package com.example.demo.unsolid;

public interface EmployeeRepository implements IEmployeeRepository{

    public Employee[] employees;

    public void addEmployee(String name) {
        // Agregar empleado
    }

    public void removeEmployee(String name) {
        // Eliminar empleado
    }

    public Employee getEmployee(String name) {
        // Obtener empleado
    }
}
