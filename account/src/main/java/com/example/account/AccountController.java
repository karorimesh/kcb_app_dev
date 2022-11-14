package com.example.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @PostMapping
    public void transactWithAccount(@RequestBody AccountDTO accountDTO){
        accountService.doTransaction(accountDTO);
    }
}
