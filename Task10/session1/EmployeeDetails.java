package BTVN.Task10.session1;

public class EmployeeDetails {

    public static void main(String[] args)
    {
// Instantiate the Employee class object
        Employee objEmp = new Employee("E001","Maria Nemeth", 40000);

// Invoke the calcCommission() with float argument
        objEmp.calcCommission(20000F);

        objEmp.displayDetails(); // Print the employee details

        objEmp.calcCommission(20000F); // Calculate commission
        objEmp.displayDetails(); // Print the details
        System.out.println("-------------------------");
// Instantiate the Employee object as PartTimeEmployee
        Employee objEmp1 = new PartTimeEmployee("E002", "Rob Smith", 30000, "Day");
        objEmp1.displayDetails(); // Print the details
    }

    }

