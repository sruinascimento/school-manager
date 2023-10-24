package br.com.rtech.schoolmanager.teacher;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Past
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
    @Column(length = 11, nullable = true, unique = true, columnDefinition = "CHAR(11)")
    private String cpf;
    @Column(length = 7, nullable = true, unique = true)
    private String rg;
    @Column(length = 1, nullable = false, columnDefinition = "CHAR(1)")
    private String gender;
    @Enumerated(EnumType.STRING)
    @Column(name = "area_of_expertise", nullable = false)
    private AreaOfExpertise areaOfExpertise;

    @Deprecated
    public Teacher() {
    }

    public Teacher(String name, LocalDate birthDate, String cpf, String rg, String gender, AreaOfExpertise areaOfExpertise) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.rg = rg;
        this.gender = gender;
        this.areaOfExpertise = areaOfExpertise;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public AreaOfExpertise getAreaOfExpertise() {
        return areaOfExpertise;
    }
}
