package br.com.rtech.schoolmanager.student;

import br.com.rtech.schoolmanager.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "students")
public class Student extends Person {
    @Past
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
    @Column(length = 11, unique = true, columnDefinition = "CHAR(11)")
    private String cpf;
    @Column(length = 10, unique = true)
    private String rg;
    @Column(length = 1, nullable = false, columnDefinition = "CHAR(1)")
    private String gender;
    @Column(length = 50, nullable = false, unique = true)
    private String registrationNumber;

    @Deprecated
    public Student() {
    }

    public Student(String name,
                   LocalDate birthDate,
                   String cpf,
                   String rg,
                   String gender,
                   String registrationNumber) {
        super(name);
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.rg = rg;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getGender() {
        return gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
