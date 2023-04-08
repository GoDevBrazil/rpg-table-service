package com.godev.rest.controller;

import com.godev.domain.vo.AccountRequest;
import com.godev.domain.vo.AccountResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {

    @PostMapping
    ResponseEntity<AccountResponse> register(@Valid @RequestBody AccountRequest accountRequest);
}
