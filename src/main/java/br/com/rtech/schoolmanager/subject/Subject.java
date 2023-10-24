package br.com.rtech.schoolmanager.subject;

import br.com.rtech.schoolmanager.student.Student;
import br.com.rtech.schoolmanager.teacher.Teacher;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 10, nullable = false, unique = true)
    private String code;
    @Column(name = "credit_hours")
    private int creditHours;
    @Enumerated(EnumType.STRING)
    private Shift shift;
    @OneToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;
    @OneToMany
    @JoinTable(name = "subjects_students",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    List<Student> students = new ArrayList<>();
}
