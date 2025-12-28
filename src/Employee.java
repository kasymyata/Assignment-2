public class Employee extends Human implements Ilearn, Iwork{
    private String job;
    private float salary;

    public Employee(int age, String name, boolean isMarried, String job, float salary) {
        super(age, name, isMarried);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String sayPosition() {
        return "I am an Employee";
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + job);
    }

    @Override
    public double getIncome() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is improving professional skills");
    }

    @Override
    public double getPerformance() {
        return salary / 1000;


        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }
    }