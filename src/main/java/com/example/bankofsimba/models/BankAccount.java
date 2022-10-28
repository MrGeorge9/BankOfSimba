package com.example.bankofsimba.models;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;

    private boolean isKing;

    private boolean isGoodGuy;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, int balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
