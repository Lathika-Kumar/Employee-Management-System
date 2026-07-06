package in.kce.main;

import java.util.ArrayList;
import java.util.Scanner;

import in.kce.bean.Employee;
import in.kce.service.EmployeeService;

public class TestEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Management");
        System.out.println("1. Store Employee"
    			+ "2. Update Employee"
    			+ "3. Fetch one Employee"
    			+ "4. Fetch All Employee"
    			+ "5. Delete Employee");

        int option = sc.nextInt();

        EmployeeService employeeService =
                new EmployeeService();

        switch(option) {

        case 1:{

            System.out.println("Enter Employee ID:");
            int empId = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Employee Name:");
            String empName = sc.nextLine();

            System.out.println("Enter Designation:");
            String desig = sc.nextLine();

            boolean result =
                    employeeService.saveEmployee(
                            empId,
                            empName,
                            desig);

            if(result) {
                System.out.println("Employee Stored Successfully");
            }
            else {
                System.out.println("Employee Storage Failed");
            }

            break;
        }
        case 2 : {
        	System.out.println("Enter Employee ID:");
            int updateId = sc.nextInt();

            sc.nextLine(); 

            System.out.println("Enter New Employee Name:");
            String updateName = sc.nextLine();

            System.out.println("Enter Designation:");
            String updateDesig = sc.nextLine();

            boolean updated =
                    employeeService.updateEmployee(
                            updateId,
                            updateName,
                            updateDesig);

            if(updated) {
                System.out.println("Employee Updated Successfully");
            }
            else {
                System.out.println("Employee Update Failed");
            }

            break;
        }
        case 3: {
        	System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            Employee emp =employeeService.getEmployee(id);
            if(emp != null) {
                System.out.println(emp.getEmpId());
                System.out.println(emp.getEmpName());
                System.out.println(emp.getDesignation());
            }
            break;
        }
        case 4 :{
                ArrayList<Employee> employee = employeeService.getAllEmployee();
                for (Employee emp : employee) {
                	 System.out.println(emp.getEmpId());
                     System.out.println(emp.getEmpName());
                     System.out.println(emp.getDesignation());
                }
                
        }
        case 5 : {
        	System.out.println("Enter Employee ID:");
            int deleteId = sc.nextInt();

            boolean deleted =
                    employeeService.deleteEmployee(deleteId);

            if(deleted) {
                System.out.println("Employee Deleted Successfully");
            }
            else {
                System.out.println("Employee Deletion Failed");
            }

            break;
        	
        }
        default:
            System.out.println("Invalid Option");
        }

        sc.close();
    }
}
