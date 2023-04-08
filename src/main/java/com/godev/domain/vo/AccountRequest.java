package com.godev.domain.vo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class AccountRequest {

    @Length(min = 4, max = 20, message = "The username field must have between 4 and 20 characters")
    @NotBlank(message = "The username field is required!")
    private String username;

    @Length(min = 6, max = 50, message = "The email field must have between 6 and 50 characters")
    @NotBlank(message = "The email field is required!")
    private String email;

    @Length(min = 8, max = 16, message = "The password field must have between 8 and 16 characters")
    @NotBlank(message = "The password field is required!")
    private String password;

    @NotNull(message = "The birthdate field is required!")
    private LocalDate birthdate;

}
