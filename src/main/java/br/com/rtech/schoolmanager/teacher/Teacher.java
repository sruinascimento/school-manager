package br.com.rtech.schoolmanager.teacher;

import br.com.rtech.schoolmanager.person.Person;
import jakarta.persistence.*;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

@Entity
@Table(name = "teachers")
public class Teacher extends Person {
    @Past
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
    @Column(length = 11, unique = true, columnDefinition = "CHAR(11)")
    private String cpf;
    @Column(length = 7, unique = true)
    private String rg;
    @Column(length = 1, nullable = false, columnDefinition = "CHAR(1)")
    private String gender;
    @Enumerated(EnumType.STRING)
    @Column(name = "area_of_expertise", nullable = false)
    private AreaOfExpertise areaOfExpertise;

    @Deprecated
    public Teacher() {
    }

    public Teacher(String name,
                   LocalDate birthDate,
                   String cpf,
                   String rg,
                   String gender,
                   AreaOfExpertise areaOfExpertise) {
        super(name);
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.rg = rg;
        this.gender = gender;
        this.areaOfExpertise = areaOfExpertise;
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
