package Homework05;

public class Employee extends Person {

    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (getAge() < 18) {
            daySalary = 0;
        } else if (getAge() > 18) {
            double coef = 1.5;
            daySalary = coef * daySalary;
        }
        return daySalary * hours;
    }

    public void showEmployeeInfo() {
        super.showPersonInfo();

    }

    @Override
    public String toString() {
        return "Employee [daySalary=" + daySalary + ", " + super.toString() + "]";
    }

}

