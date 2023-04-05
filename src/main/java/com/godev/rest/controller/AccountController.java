package com.godev.rest.controller;

import com.godev.domain.vo.AccountRequest;
import com.godev.domain.vo.AccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {

    ResponseEntity<AccountResponse> register(@RequestBody AccountRequest accountRequest);
}
