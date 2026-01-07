public final class Student extends Human implements Ilearn {
    private String major;
    private float gpa;
    public static final String uniName = "AITU";

    public Student(int age, String name, boolean isMarried, String major, float gpa){
        super(age, name, isMarried);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public String sayPosition(){
        return "I am a student";
    }

    @Override
    public void study() {
        System.out.println(name + " is studying " + major);
    }

    @Override
    public double getPerformance() {
        return gpa;
    }

    public final void showUni() {
        System.out.println("University: " + uniName);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
