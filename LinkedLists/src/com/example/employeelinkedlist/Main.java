package com.example.employeelinkedlist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    EmpLinkedList empList = new EmpLinkedList();
	    Scanner scanner = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.println("\nMenu:");
	        System.out.println("1. Register Employee");
	        System.out.println("2. Search Employee");
	        System.out.println("3. Delete Employee");
	        System.out.println("4. Update Employee Details");
	        System.out.println("5. Display All Employees");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	        choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	                System.out.print("Enter Employee ID: ");
	                int id = scanner.nextInt();
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter Employee Name: ");
	                String name = scanner.nextLine();
	                System.out.print("Enter Employee Gender: ");
	                String gender = scanner.nextLine();
	                System.out.print("Enter Employee Salary: ");
	                double salary = scanner.nextDouble();
	                empList.registerEmp(id, name, gender, salary);
	                break;
	            case 2:
	                System.out.print("Enter Employee ID to search: ");
	                int searchId = scanner.nextInt();
	                empList.searchEmployee(searchId);
	                break;
	            case 3:
	                System.out.print("Enter Employee ID to delete: ");
	                int deleteId = scanner.nextInt();
	                empList.deleteEmployee(deleteId);
	                break;
	            case 4:
	                System.out.print("Enter Employee ID to update: ");
	                int updateId = scanner.nextInt();
	                System.out.println("1. Update Gender");
	                System.out.println("2. Update Name");
	                System.out.println("3. Update Salary");
	                System.out.print("Enter choice for update: ");
	                int updateChoice = scanner.nextInt();
	                scanner.nextLine(); // Consume newline
	                System.out.print("Enter new value: ");
	                String newValue = scanner.nextLine();
	                empList.updateEmployee(updateId, updateChoice, newValue);
	                break;
	            case 5:
	                empList.displayEmplist();
	                break;
	            case 6:
	                System.out.println("Exiting...");
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	                break;
	        }
	    } while (choice != 6);
	    scanner.close();
	}

}
