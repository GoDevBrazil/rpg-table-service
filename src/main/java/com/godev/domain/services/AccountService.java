package com.godev.domain.services;

import com.godev.domain.vo.AccountRequest;
import com.godev.domain.vo.AccountResponse;

public interface AccountService {

    AccountResponse register(AccountRequest accountRequest);

    AccountResponse findUser(String user);
}
