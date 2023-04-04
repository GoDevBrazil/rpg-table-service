package com.godev.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class AccountRequest {

    @NotBlank(message = "The username field is required!")
    @Max(message = "The username field must be less than 20 characters", value = 20)
    @Min(message = "The username field must be greater than 4 characters", value = 4)
    private String username;

    @NotBlank(message = "The email field is required!")
    @Max(message = "The email field must be less than 50 characters", value = 50)
    @Min(message = "The email field must be greater than 6 characters", value = 6)
    private String email;

    @NotBlank(message = "The password field is required!")
    @Max(message = "The password field must be less than 16 characters", value = 16)
    @Min(message = "The email field must be greater than 8 characters", value = 8)
    private String password;

    @NotBlank(message = "The birthdate field is required!")
    @JsonFormat(pattern = "MM/dd/yyyy")
    private OffsetDateTime birthdate;

}
