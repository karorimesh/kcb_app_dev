package com.example.account;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public void doTransaction(AccountDTO accountDTO) {
        // Logic to debit and credit account
        AccountHistory accountHistory = AccountHistory.builder()
                .accountNumber(accountDTO.accountNumber())
                .amount(accountDTO.amount())
                .narration(accountDTO.message())
                .build();

        accountRepository.save(accountHistory);
    }
}
