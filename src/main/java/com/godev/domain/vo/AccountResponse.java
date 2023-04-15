package com.godev.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountResponse {

    private Integer id;
    private String username;
    private String email;
    private String avatar;
    private LocalDate birthdate;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
