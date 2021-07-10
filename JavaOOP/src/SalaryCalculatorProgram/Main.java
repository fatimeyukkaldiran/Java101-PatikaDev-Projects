package SalaryCalculatorProgram;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000.0, 45,1985);
        employee.print();
    }
}
/*
Name: Kemal
Salary: 2000.0
Work hours: 45
Hire Year: 1985
Tax: 60.0
Bonus: 150.0
Raise Salary: 300.0
Tax+bonus salary : 2090.0
totally salary: 2300.0
 */