package tech.kcmodeveloper;

public class Main {

    public static void main(String[] args) {

        BankAccount Katie = new BankAccount();
        BankAccount Dan = new BankAccount();
        BankAccount Willie = new BankAccount();

        Katie.setCustomerName("Katie");
        Katie.getCustomerName();
        Katie.setCustomerEmail("katay123@google.com");
        Katie.getCustomerEmail();
        Katie.setAccountNumber(1234567);
        Katie.getAccountNumber();
        Katie.setAccountBalance(5267.98);
        Katie.accountDeposit(2367.79);
        Katie.getAccountBalance();
        Katie.accountWithdraw(2345.98);
        Katie.getAccountBalance();
        Katie.setPhoneNumber("555-567-3254");
        Katie.getPhoneNumber();

        System.out.println("");
        System.out.println("");

        Dan.setCustomerName("Dan");
        Dan.getCustomerName();
        Dan.setCustomerEmail("dan123@google.com");
        Dan.getCustomerEmail();
        Dan.setAccountNumber(1221567);
        Dan.getAccountNumber();
        Dan.setAccountBalance(1267.98);
        Dan.accountDeposit(1367.79);
        Dan.getAccountBalance();
        Dan.accountWithdraw(2645.98);
        Dan.getAccountBalance();
        Dan.setPhoneNumber("555-123-6754");
        Dan.getPhoneNumber();

        System.out.println("");
        System.out.println("");

        Willie.setCustomerName("Willie");
        Willie.getCustomerName();
        Willie.setCustomerEmail("Willie123@google.com");
        Willie.getCustomerEmail();
        Willie.setAccountNumber(12567);
        Willie.getAccountNumber();
        Willie.setAccountBalance(267.98);
        Willie.accountDeposit(367.79);
        Willie.getAccountBalance();
        Willie.accountWithdraw(345.98);
        Willie.getAccountBalance();
        Willie.setPhoneNumber("555-431-9087");
        Willie.getPhoneNumber();
    }
}
