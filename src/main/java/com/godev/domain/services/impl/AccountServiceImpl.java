package com.godev.domain.services.impl;

import com.godev.domain.models.Account;
import com.godev.domain.repositories.AccountRepository;
import com.godev.domain.services.AccountService;
import com.godev.domain.vo.AccountRequest;
import com.godev.domain.vo.AccountResponse;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountResponse register(AccountRequest accountRequest) {
        var account = Account
                .builder()
                .withUsername(accountRequest.getUsername())
                .withEmail(accountRequest.getEmail())
                .withPassword(accountRequest.getPassword())
                .withBirthdate(accountRequest.getBirthdate())
                .withCreatedAt(OffsetDateTime.now(ZoneOffset.UTC))
                .build();

        var accountSaved = accountRepository.save(account);

        return AccountResponse
                .builder()
                .withId(accountSaved.getId())
                .withUsername(accountSaved.getUsername())
                .withEmail(accountSaved.getEmail())
                .withAvatar(accountSaved.getAvatar())
                .withBirthdate(accountSaved.getBirthdate())
                .withCreatedAt(accountSaved.getCreatedAt())
                .withUpdatedAt(accountSaved.getUpdatedAt())
                .build();
    }
}
