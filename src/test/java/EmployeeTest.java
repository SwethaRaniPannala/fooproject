import Employee.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testGetFirstName() {
        Employee employee = new Employee();
        employee.setFirstName("Swetha");
        String result = employee.getFirstName();
        Assertions.assertEquals("Swetha", result);
    }

    @Test
    public void testSetFirstName() {
        Employee employee = new Employee();
        employee.setFirstName("Swetha Rani");
        Assertions.assertEquals("Swetha Rani", employee.FirstName);
    }

    @Test
    public void testGetLastName() {
        Employee employee = new Employee();
        employee.setLastName("Pannala");
        String result = employee.getLastName();
        Assertions.assertEquals("Pannala", result);
    }

    @Test
    public void testSetLastName() {
        Employee employee = new Employee();
        employee.setLastName("Pannala");
        Assertions.assertEquals("Pannala", employee.LastName);
    }

    @Test
    public void testGetAge() {
        Employee employee = new Employee();
        employee.setAge(14);
        int result = employee.getAge();
        Assertions.assertEquals(14, result);
    }

    @Test
    public void testSetAge() {
        Employee employee = new Employee();
        employee.setAge(24);
        Assertions.assertEquals(24, employee.Age);
    }

    @Test
    public void testGetEmployeeId() {
        Employee employee = new Employee();
        employee.setEmployeeId(1132);
        int result = employee.getEmployeeId();
        Assertions.assertEquals(1132, result);
    }

    @Test
    public void testSetEmployeeId() {
        Employee employee = new Employee();
        employee.setEmployeeId(1132);
        Assertions.assertEquals(1132, employee.getEmployeeId());
    }

    @Test
    public void testGetCompanyId() {
        Employee employee = new Employee();
        employee.setCompanyId(132);
        int result = employee.getCompanyId();
        Assertions.assertEquals(132, result);
    }

    @Test
    public void testSetCompanyId() {
        Employee employee = new Employee();
        employee.setCompanyId(132);
        Assertions.assertEquals(132, employee.CompanyId);
    }

    @Test
    public void testSetSalary() {
        Employee employee = new Employee();
        employee.setSalary(18000);
        Assertions.assertEquals(18000, employee.Salary);
    }

    @Test
    public void testGetSalary() {
        Employee employee = new Employee();
        employee.setSalary(18000);
        double result = employee.getSalary();
        Assertions.assertEquals(18000, result);
    }
}
