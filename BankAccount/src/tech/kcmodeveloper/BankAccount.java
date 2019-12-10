package tech.kcmodeveloper;

import java.text.DecimalFormat;

public class BankAccount {

    DecimalFormat df = new DecimalFormat("0.##");

    private double accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public void accountWithdraw(double amountToWithdraw){
        if (this.accountBalance >= amountToWithdraw) { // wont allow a withdraw if the withdraw amount is more than what is in the account
            System.out.println("You are withdrawing $" + amountToWithdraw + " from your checking account.");
            System.out.println("Your balance before the withdraw: $" + df.format(this.accountBalance) + ".");
            this.accountBalance -= amountToWithdraw;
            System.out.println("Your balance after the withdraw: $" + df.format(this.accountBalance) + ".");
        } else {
            double discrepancy = amountToWithdraw - this.accountBalance;
            System.out.println("You are overdrawn. Your current balance is $" + df.format(this.accountBalance) + ". Therefore you are $" + df.format(discrepancy) + " short."  );
        }
    }

    public void accountDeposit(double amountToDeposit){
        System.out.println("You are depositing $" + amountToDeposit + " into your checking account.");
        System.out.println("Your balance before the deposit: $" + df.format(this.accountBalance) + ".");
        this.accountBalance += amountToDeposit;
        System.out.println("Your balance after the deposit: $" + df.format(this.accountBalance) + ".");
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("Your account number is set to: " + this.accountNumber + ".");
    }

    public void getAccountNumber(){
        System.out.println("Your account number is " + this.accountNumber + ".");
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
        System.out.println("You set up an initial balance of $" + df.format(this.accountBalance) + ".");
    }

    public void getAccountBalance(){
        System.out.println("Your current account balance is: $" + df.format(this.accountBalance) + ".");
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void getCustomerName(){
        System.out.println("Customer name: " + this.customerName + ".");
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void getCustomerEmail(){
        System.out.println("Customer email: " + this.customerEmail + ".");
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void getPhoneNumber(){
        System.out.println("Customer phone number: " + this.phoneNumber + ".");
    }
}
