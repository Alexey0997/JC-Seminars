package ru.geekbrains.seminar3.Comparators;

import ru.geekbrains.seminar3.Employees.Employee;

import java.util.Comparator;

public class EmployeeSurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getSurname().compareTo(employee2.getSurname());
    }
}
