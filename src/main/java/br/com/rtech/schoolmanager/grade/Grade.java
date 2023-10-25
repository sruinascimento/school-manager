package br.com.rtech.schoolmanager.grade;

import br.com.rtech.schoolmanager.student.Student;
import br.com.rtech.schoolmanager.subject.Subject;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double fistBimesterGrade;
    private double secondBimesterGrade;
    private double thirdBimesterGrade;
    private double fourthBimesterGrade;
    @Transient
    private double finalGrade;
    private boolean approved = false;
    @OneToOne
    private Subject subject;
    @OneToOne
    private Student student;

    @Deprecated
    public Grade() {
    }

    public Long getId() {
        return id;
    }

    public double getFistBimesterGrade() {
        return fistBimesterGrade;
    }

    public double getSecondBimesterGrade() {
        return secondBimesterGrade;
    }

    public double getThirdBimesterGrade() {
        return thirdBimesterGrade;
    }

    public double getFourthBimesterGrade() {
        return fourthBimesterGrade;
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
}
