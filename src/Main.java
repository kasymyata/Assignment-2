import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Human employee = new Employee(36, "Kasym", true, "Itshnik", 400000f);
        Student student = new Student(18, "Arsen", false, "Media technology", 1.8f);
        Iwork worker = new Employee(25, "Azamat", true, "Manager", 300000f);
        Ilearn learner = student;

        System.out.println(employee.sayPosition());
        System.out.println(student.sayPosition());
        System.out.println("University: " + Student.uniName);

        System.out.println(student.sayHello());
        System.out.println(student.sayPosition());
        student.study();
        student.showUni();

        System.out.println(employee.sayPosition());

        worker.work();
        System.out.println("Income: " + worker.getIncome());

        learner.study();
        System.out.println("Performance: " + learner.getPerformance());
    }
}