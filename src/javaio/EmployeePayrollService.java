package javaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public void readEmployeePayrollData(Scanner scanner) {
        System.out.print("Enter Employee Id: ");
        int id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }

    public void writeEmployeePayrollData() {
        System.out.println("Employee Payroll Data: " + employeePayrollList);
    }
}
