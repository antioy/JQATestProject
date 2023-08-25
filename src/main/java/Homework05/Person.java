package Homework05;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {

    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", isMan=" + isMan + "]";
    }

    public int getAge() {
        return age;
    }

}
