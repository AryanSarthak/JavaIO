package javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private static final String FILE_NAME = "employee-payroll.txt";
    final List<EmployeePayroll> employeePayrollList;

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

    public void writeEmployeePayrollToFile() {
        StringBuilder buffer = new StringBuilder();
        employeePayrollList.forEach(emp ->
                buffer.append(emp.toString()).append("\n"));
        try {
            Files.write(Paths.get(FILE_NAME), buffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printEmployeePayrollFromFile() {
        try {
            Files.lines(Paths.get(FILE_NAME)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long countEntries() {
        try {
            return Files.lines(Paths.get(FILE_NAME)).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<String> readEmployeePayrollFromFile() {
        try {
            return Files.readAllLines(Paths.get(FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
