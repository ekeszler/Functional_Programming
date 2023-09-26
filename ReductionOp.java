package collections.streamsempty;

import collections.streamsempty.helperclasses.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReductionOp {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(20, 40, -60, 5);
        //1. printeaza maximul din lista de numere
        //2. printeaza suma numerelor din lista

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex" , 23, 23000, "USA"));
        employeeList.add(new Employee("Ben" , 63, 25000, "India"));
        employeeList.add(new Employee("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi" , 43, 67000, "China"));
        employeeList.add(new Employee("Ryan" , 53, 54000, "Libya"));
        //3. printeaza suma salariilor angajatilor din lista
    }
}
