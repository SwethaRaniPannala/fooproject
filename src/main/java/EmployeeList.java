import Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<Employee> employees = new ArrayList<Employee>();

    public void EmployeeList(){

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public Employee getEmployeeById(int employeeId){

        for (Employee employee : employees){
            if(employee.EmployeeId == employeeId){
                return employee;
            }
        }

        return null;
    }

    public double increaseEmployeeSalary(int employeeId, int percentageIncrease){
        if(percentageIncrease >0 && percentageIncrease <= 100){
            Employee employee = getEmployeeById(employeeId);
            double orgSalary = employee.getSalary();
            double increaseSalary = orgSalary * percentageIncrease/100;
            double newSalary = employee.getSalary() + increaseSalary;
            employee.setSalary(newSalary);
            return newSalary;
        }

        return 0;
    }
}
