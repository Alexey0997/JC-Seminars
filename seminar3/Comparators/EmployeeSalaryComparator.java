package ru.geekbrains.seminar3.Comparators;

import ru.geekbrains.seminar3.Employees.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }
}
