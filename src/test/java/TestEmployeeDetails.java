import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisal
    @Test
    public void testCalculateAppriasal() {
        //TODO set employee name
        //TODO set employee age
        //TODO set Empoyee Mothly Salary

        // TODO Compute Appraisal double appraisal = .....
        // TODO compute assertEquals for testing the appraisal
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        //TODO Compute Yearly Salary double salary = ....
        // TODO write test with Junit assertEquals
    }
}
