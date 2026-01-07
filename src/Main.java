public class Main {
    public static void main(String[] args) {

        Human employee = new Employee(36, "Kasym", true, "Itshnik", 400000f);
        Student student = new Student(18, "Arsen", false, "Media technology", 1.8f);
        Iwork worker = new Employee(25, "Azamat", true, "Manager", 300000f);
        Ilearn learner = student;


        System.out.println(employee.sayPosition());
        System.out.println(student.sayPosition());

        student.showUni();
        System.out.println("Student GPA: " + student.getGpa());
        student.study();
        System.out.println("Performance: " + student.getPerformance());

        worker.work();
        System.out.println("Worker Income: " + worker.getIncome());

        learner.study();
        System.out.println("Learner Performance: " + learner.getPerformance());
    }
}
