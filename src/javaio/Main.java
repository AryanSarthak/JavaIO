package javaio;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Java IO");

        EmployeePayrollService service = new EmployeePayrollService();

        service.employeePayrollList.add(new EmployeePayroll(1, "Aryan", 50000));
        service.employeePayrollList.add(new EmployeePayroll(2, "Rahul", 60000));
        service.employeePayrollList.add(new EmployeePayroll(3, "Neha", 55000));

        service.writeEmployeePayrollToFile();
        service.printEmployeePayrollFromFile();
        System.out.println(service.countEntries());
    }
}
