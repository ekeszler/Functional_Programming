package collections.streamsempty;

import collections.streamsempty.helperclasses.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReductionOp {
    public static void main(String[] args) {
        List<Integer> transactions = List.of(20, 40, -60, 5);
        //1. printeaza maximul din lista de numere

        Optional<Integer> max = transactions.stream()
                .max((t1, t2) -> Integer.compare(t1, t2));

        System.out.println(max.get());
        //2. printeaza suma numerelor din lista


        Optional<Integer> allTransactions = transactions.stream()
                .reduce((sum, transaction) -> sum + transaction);

        System.out.println(allTransactions.get());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex" , 23, 23000, "USA"));
        employeeList.add(new Employee("Ben" , 63, 25000, "India"));
        employeeList.add(new Employee("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi" , 43, 67000, "China"));
        employeeList.add(new Employee("Ryan" , 53, 54000, "Libya"));
        //3. printeaza suma salariilor angajatilor din lista

        try{
            System.out.println(computeTotalSalaryExpenses(employeeList));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Integer computeTotalSalaryExpenses(List<Employee> employeeList) throws Exception{
        Optional<Integer> totalSalary = employeeList.stream()
                .map(employee -> employee.getSalary())
                .reduce((sum, salary) -> sum+salary);

        return totalSalary.orElseThrow(() -> new Exception("Salary could not be computed"));
    }
}
