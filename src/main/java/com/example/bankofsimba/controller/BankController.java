package com.example.bankofsimba.controller;

import com.example.bankofsimba.models.BankAccount;
import com.example.bankofsimba.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {

    @GetMapping("/show")
    public String showAccounts (Model model){
        BankAccount simba = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("bankaccount", simba);
        return "index";
    }

    @GetMapping("/htmlCeption")
    public String htmlCeption (Model model){
        model.addAttribute("htmlCeption", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlCeption";
    }

    @GetMapping("/bankAccounts")
    public String bankAccounts (Model model){
        model.addAttribute("bankAccounts", BankService.getBankAccounts());
        return "bankAccounts";
    }

    @GetMapping("/add/{id}")
    public String addBalancePage (@PathVariable int id) {
        BankService.getBankAccounts().get(id).setBalance(BankService.getBankAccounts().get(id).isKing() ? BankService.getBankAccounts().get(id).getBalance()+100 : BankService.getBankAccounts().get(id).getBalance()+10);
        return "redirect:/bankAccounts";
    }

    @GetMapping("/addAnimal")
    public String addAnimal (@ModelAttribute BankAccount bankAccount){
        return "addAnimal";
    }

    @PostMapping("/addAnimal")
    public String addNewAnimal (@RequestParam(name = "name") String name,
                                @RequestParam(name = "balance") int balance,
                                @RequestParam(name = "animalType") String animalType,
                                @RequestParam(name = "isKing", defaultValue = "false") boolean isking,
                                @RequestParam(name = "good", defaultValue = "false") boolean isgoodguy,
                                Model model){

        BankService.getBankAccounts().add(new BankAccount(name, balance, animalType, isking,  isgoodguy));
       return "redirect:/bankAccounts";
    }

}
