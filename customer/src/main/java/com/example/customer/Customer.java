package com.example.customer;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private UUID id;
    private String customerName;
    private String email;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.PERSIST})
    private List<Account> accountList;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.PERSIST})
    private List<Card> customerCards;
}
