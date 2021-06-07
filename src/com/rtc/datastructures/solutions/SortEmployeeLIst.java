package com.rtc.datastructures.solutions;

import java.util.ArrayList;
import java.util.List;

public class SortEmployeeLIst {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

    }
}
