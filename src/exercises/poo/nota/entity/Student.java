package exercises.poo.nota.entity;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double gradeCalc() {
        return grade1 + grade2 + grade3;
    }

    public double gradeFailed() {
        return 60.0 - gradeCalc();
    }

    @Override
    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", gradeCalc());
    }

}
