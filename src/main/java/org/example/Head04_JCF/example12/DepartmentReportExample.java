package org.example.Head04_JCF.example12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String dept;
    private int salary;

    public Employee(String name, String dept, int salary){
        this.dept=dept;
        this.name=name;
        this.salary=salary;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}

public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
        new Employee("Alice", "HR", 3000),
        new Employee("Bob","IT", 4000),
        new Employee("Charlie","IT", 5000),
        new Employee("David","HR", 6000),
        new Employee("Eve","Sales", 7000)
        );

        Map<String, IntSummaryStatistics> deptStats =
                emps.stream().collect(Collectors.groupingBy(
                        Employee ::getDept,
                        Collectors.summarizingInt(Employee::getSalary)
                ));

        deptStats.forEach((dept, stats) ->{
            System.out.println("== " + dept + " 부서 ==");
            System.out.println("사원 수: " + stats.getCount());
            System.out.println("총 연봉: " + stats.getSum());
            System.out.println("평균 연봉: " + stats.getAverage());
            System.out.println("최대 연봉: " + stats.getMax());
            System.out.println("최소 연봉: " + stats.getMin());

        });
    }

}
