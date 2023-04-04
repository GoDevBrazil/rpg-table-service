package com.godev.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class AccountResponse {

    private Integer id;
    private String username;
    private String email;
    private String avatar;
    private OffsetDateTime birthdate;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
