package com.pm.patientservice.dto;

import com.pm.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequestDTO {
    @NotBlank(message = "Name is requierd")
    @Size(max =50 , message = "Name cannot exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is requierd")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is requierd")
    private String address;

    @NotBlank(message = "Date of birth is requierd")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class,
            message = "Register date is requierd")
    private String registeredDate;
}
