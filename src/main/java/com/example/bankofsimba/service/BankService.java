package com.example.bankofsimba.service;

import com.example.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BankService {
    static List<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 2000, "lion", true, true),
            new BankAccount("Scar", 2500, "lion", false, false),
            new BankAccount("Mufasa", 3000, "lion", true, true),
            new BankAccount("Timon", 1200, "hamster", false, true),
            new BankAccount("Pumba", 2300, "pig", false, true)));

    public static List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public static void setBankAccounts(List<BankAccount> bankAccounts) {
        BankService.bankAccounts = bankAccounts;
    }
}
