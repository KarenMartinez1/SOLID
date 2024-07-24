# Members
- Sebastian Cardozo Padilla
- Nestor Javier Mahecha Parra
- Karen Dayana Martinez Perez

# Analysis
![problem](./Task-Problem.png)

# Solution
![solution](./Task-Solution.png)

- EmployeeManager viola SRP: porque adem�s de manejar los empleados tambi�n guarda el archivo y calculaba salarios.
- ReportGenerator viola OCP: dado que para agregar una nueva extensi�n habria que ir a la clase y crear un nuevo metodo.
- PartTimeEmployee viola LSP: porque la clase lanza una excepci�n al usar getName, afectando la correcci�n del programa.
- SalaryCalculator viola DIP: porque inyecta una dependencia de EmployeeManager (bajo nivel) en lugar de usar la abstracci�n.