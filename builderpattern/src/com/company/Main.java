package com.company;

public class Main {


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder(29810L)
                .atBranch("Bank Branch")
                .withClient("John Doe")
                .atInterestRate(1.0)
                .openBalance(1200.0)
                .build();

        System.out.println(bankAccount);
    }
}
