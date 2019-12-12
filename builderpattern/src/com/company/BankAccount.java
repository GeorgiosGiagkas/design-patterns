package com.company;
 /*
    Use it when the object has many mandatory and/or optional paramenters.
    To avoid using constructor with many parameters.
    Its easier to read than using setters.
    Object created is immutable (no setters). The Builder static class is used to set the object fields.
 */


public class BankAccount {
    private long account;
    private String client;
    private String branch;
    private double balance;
    private double interest;

    private BankAccount(){
    }


    //getters only
    public long getAccount() {
        return account;
    }

    public String getClient() {
        return client;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }


    //Builder  class
    public static class BankAccountBuilder{
        private long account;//required field
        private String client;
        private String branch;
        private double balance;
        private double interest;

        public BankAccountBuilder(long account){//set required field in the constructor
            this.account = account;
        }
        public BankAccountBuilder withClient(String client){
            this.client = client;
            return  this;
        }
        public BankAccountBuilder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public BankAccountBuilder openBalance(double balance){
            this.balance=balance;
            return this;
        }
        public BankAccountBuilder atInterestRate(double interest){
            this.interest=interest;
            return this;
        }

        public BankAccount build(){//creates the bankacount object
            BankAccount bankAccount = new BankAccount();
            bankAccount.account=this.account;
            bankAccount.client=this.client;
            bankAccount.branch=this.branch;
            bankAccount.balance=this.balance;
            bankAccount.interest=this.interest;
            return  bankAccount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account=" + account +
                ", client='" + client + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}
