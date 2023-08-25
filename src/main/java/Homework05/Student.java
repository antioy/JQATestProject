package Homework05;

public class Student extends Person {

    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        super.showPersonInfo();
        if (score >= 2 && score <= 6) {
            System.out.println(" Student score: " + score);
        } else {
            System.out.println("Invalid score! ");
        }
    }

    @Override
    public String toString() {
        return "Student [score=" + score + ", " + super.toString() +  "]";
    }

}
