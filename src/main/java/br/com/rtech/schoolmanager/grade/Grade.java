package br.com.rtech.schoolmanager.grade;

import br.com.rtech.schoolmanager.student.Student;
import br.com.rtech.schoolmanager.subject.Subject;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;


public class Grade {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "first_two_months_grade")
    private double firstTwoMonthsGrade;
    @Column(name = "first_two_months_grade")
    private double secondTwoMonthsGrade;
    @Column(name = "first_two_months_grade")
    private double thirdTwoMonthsGrade;
    @Column(name = "first_two_months_grade")
    private double fourthTwoMonthsGrade;
    @Transient
    private double finalGrade;
    private boolean approved = false;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Deprecated
    public Grade() {
    }

    public Grade(Subject subject, Student student) {
        this.subject = subject;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public double getFirstTwoMonthsGrade() {
        return firstTwoMonthsGrade;
    }

    public double getSecondTwoMonthsGrade() {
        return secondTwoMonthsGrade;
    }

    public double getThirdTwoMonthsGrade() {
        return thirdTwoMonthsGrade;
    }

    public double getFourthTwoMonthsGrade() {
        return fourthTwoMonthsGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public boolean isApproved() {
        return approved;
    }

    public Subject getSubject() {
        return subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setFirstTwoMonthsGrade(double firstTwoMonthsGrade) {
        this.firstTwoMonthsGrade = firstTwoMonthsGrade;
    }

    public void setSecondTwoMonthsGrade(double secondTwoMonthsGrade) {
        this.secondTwoMonthsGrade = secondTwoMonthsGrade;
    }

    public void setThirdTwoMonthsGrade(double thirdTwoMonthsGrade) {
        this.thirdTwoMonthsGrade = thirdTwoMonthsGrade;
    }

    public void setFourthTwoMonthsGrade(double fourthTwoMonthsGrade) {
        this.fourthTwoMonthsGrade = fourthTwoMonthsGrade;
    }

    public void calculateFinalGrade() {
        this.finalGrade = (this.firstTwoMonthsGrade + this.secondTwoMonthsGrade + this.thirdTwoMonthsGrade + this.fourthTwoMonthsGrade) / 4;
    }
}
