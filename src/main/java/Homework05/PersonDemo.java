package Homework05;

public class PersonDemo {


    private static Person kalina;

    public static void main(String[] args) {

        Person[] people = new Person[10];
        Person ivan = new Person("Ivana", 30, true);
        Person petya = new Person("Kalina", 26, false);

        Student ivo = new Student("Ivo", 20, true, 5.5);
        Student bobi = new Student("Bobi", 22, true, 4.5);

        Employee joro = new Employee("Georgi", 29, true, 50);
        Employee hristo = new Employee("Hristo", 35, true, 60);

        people[0] = ivan;
        people[1] = kalina;
        people[2] = ivo;
        people[3] = bobi;
        people[4] = joro;
        people[5] = hristo;

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i] instanceof Student) {
                    Student student = (Student) people[i];

                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i] instanceof Employee) {
                    Employee employee = (Employee) people[i];

                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i] instanceof Person) {
                    Person person = people[i];
                    System.out.println(person);

                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if (people[i] instanceof Employee) {
                    Employee employee = (Employee) people[i];

                    System.out.println("Overtime money: " + employee.calculateOvertime(2.0));

                }
            }
        }

    }

}
