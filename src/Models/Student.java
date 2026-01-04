package Models;

public class Student extends Person {
    private double gpa;
    private static final double SCHOLARSHIP = 36660.0;

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }
    @Override
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        if(gpa> 2.67) {
            return SCHOLARSHIP;
        }
        else
        return 0;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(),other.getPaymentAmount());
    }
}
