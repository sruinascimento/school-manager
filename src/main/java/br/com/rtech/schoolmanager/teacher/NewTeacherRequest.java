package br.com.rtech.schoolmanager.teacher;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record NewTeacherRequest(
        @NotBlank
        String name,
        @Past
        LocalDate birthDate,
        @CPF
        String cpf,
        @Pattern(regexp = "\\d{7,8}-?\\d?")
        String rg,
        @Pattern(regexp = "[MmFf]")
        String gender,
        @NotNull
        AreaOfExpertise areaOfExpertise) {
}
