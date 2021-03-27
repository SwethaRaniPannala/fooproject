import Employee.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeListTest {

    @Test
    void testAddEmployee(){
        EmployeeList employeeList = new EmployeeList();
        Employee employee = new Employee();
        employee.setEmployeeId(12);
        employee.setFirstName("Swetha");
        employee.setLastName("Rani");
        employee.setSalary(12000);
        employee.setCompanyId(5553);
        employee.setAge(32);

        employeeList.addEmployee(employee);
        int actualCount = employeeList.getAllEmployees().size();
        Employee employeeResult = employeeList.getEmployeeById(12);
        Assertions.assertEquals(1, actualCount);
        Assertions.assertEquals(employee.getFirstName(), employeeResult.getFirstName());
        Assertions.assertEquals(employee.getLastName(), employeeResult.getLastName());
        Assertions.assertEquals(employee.getSalary(), employeeResult.getSalary());
        Assertions.assertEquals(employee.getCompanyId(), employeeResult.getCompanyId());
        Assertions.assertEquals(employee.getAge(), employeeResult.getAge());
    }

    @Test
    void testGetEmployeeById(){
        EmployeeList employeeList = new EmployeeList();
        Employee employee = new Employee();
        employee.setEmployeeId(13);
        employee.setFirstName("Pralavika");
        employee.setLastName("R");
        employee.setSalary(17000);
        employee.setCompanyId(5556);
        employee.setAge(31);

        employeeList.addEmployee(employee);
        Employee employeeResult = employeeList.getEmployeeById(13);
        Assertions.assertEquals(employee.getFirstName(), employeeResult.getFirstName());
        Assertions.assertEquals(employee.getLastName(), employeeResult.getLastName());
        Assertions.assertEquals(employee.getSalary(), employeeResult.getSalary());
        Assertions.assertEquals(employee.getCompanyId(), employeeResult.getCompanyId());
        Assertions.assertEquals(employee.getAge(), employeeResult.getAge());
    }

    @Test
    void  testIncreaseEmployeeSalary(){
            EmployeeList employeeList = new EmployeeList();
            Employee employee = new Employee();
            employee.setEmployeeId(12);
            employee.setFirstName("Swetha");
            employee.setLastName("Rani");
            employee.setSalary(10000);
            employee.setCompanyId(5553);
            employee.setAge(32);
            employeeList.addEmployee(employee);

            double result = employeeList.increaseEmployeeSalary(12, 50);

            Assertions.assertEquals(result, 15000);
    }

}