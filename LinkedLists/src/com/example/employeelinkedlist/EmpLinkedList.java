package com.example.employeelinkedlist;

public class EmpLinkedList {
    Node root;

    void createEmpList() {
        root = null;
    }
    
    void registerEmp(Employee emp) {
        Node n = new Node(emp);
        if (root == null)
            root = n;
        else {
            n.next = root;
            root = n;
        }
        System.out.println("Employee Inserted");
    }
    public void registerEmp(int id, String name, String gender, double salary) {
        Employee newEmployee = new Employee(id, name, gender, salary);
        registerEmp(newEmployee); // Calls the existing registerEmp(Employee emp) method
    }

    void displayEmplist() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            while (t != null) {
                System.out.print("| ID: " + t.emp.id + " | Name: " + t.emp.name + " | Gender: " + t.emp.gender + " | Salary: " + t.emp.salary + " | ->");
                t = t.next;
            }
            System.out.println();
        }
    } 
    void searchEmployee(int key) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            while (t != null && key != t.emp.id)
                t = t.next;
            if (t == null)
                System.out.println(key + " not found in list");
            else
                System.out.println(key + " found in list");
        }
    }
    void deleteEmployee(int key) {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t = root;
            Node t2 = root;
            while (t != null && key != t.emp.id) {
                t2 = t;
                t = t.next;
            }
            if (t == null)
                System.out.println(key + " not found in list");
            else {
                System.out.println(key + " found in list");
                if (t == root)
                    root = root.next;
                else if (t.next == null)
                    t2.next = null;
                else
                    t2.next = t.next;
                System.out.println("Employee ID: " + t.emp.id + " deleted");
            }
        }
    }
    void updateEmployee(int id, int choice, String newValue) {
        Node temp = root;
        while (temp != null && temp.emp.id != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Employee with ID " + id + " not found.");
        } else {
            switch (choice) {
                case 1:
                    temp.emp.gender = newValue;
                    System.out.println("Gender updated successfully for employee with ID " + id);
                    break;
                case 2:
                    temp.emp.name = newValue;
                    System.out.println("Name updated successfully for employee with ID " + id);
                    break;
                case 3:
                    temp.emp.salary = Double.parseDouble(newValue);
                    System.out.println("Salary updated successfully for employee with ID " + id);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

}
