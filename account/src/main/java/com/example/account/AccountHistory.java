package com.example.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountHistory {
    @Id
    private UUID id;
    private String accountNumber;
    private long amount;
    private TransactionType transactionType;
    private String narration;
}
