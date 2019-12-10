package tech.kcmodeveloper;

public class Main {

    public static void main(String[] args) {

        BankAccount Katie = new BankAccount("1625373", 5267.98, "Katie",
                "katay123@google.com", "555-908-1234");
        BankAccount Dan = new BankAccount("1625373", 2267.98, "Dan",
                "dan123@google.com", "555-876-1234");
        BankAccount Willie = new BankAccount("1625373", 3267.98, "Willie",
                "wilie123@google.com", "555-324-1234");
        BankAccount Marsha = new BankAccount("125609", 267.98, "Marsha",
                "marsha123@google.com", "555-123-1234");

        Katie.getCustomerName();
        Katie.getCustomerEmail();
        Katie.getAccountNumber();
        Katie.accountDeposit(2367.79);
        Katie.getAccountBalance();
        Katie.accountWithdraw(2345.98);
        Katie.getAccountBalance();
        Katie.getPhoneNumber();

        System.out.println("\n\n");

        Dan.getCustomerName();
        Dan.getCustomerEmail();
        Dan.getAccountNumber();
        Dan.accountDeposit(1367.79);
        Dan.getAccountBalance();
        Dan.accountWithdraw(2645.98);
        Dan.getAccountBalance();
        Dan.getPhoneNumber();

        System.out.println("\n\n");

        Willie.getCustomerName();
        Willie.getCustomerEmail();
        Willie.getAccountNumber();
        Willie.accountDeposit(367.79);
        Willie.getAccountBalance();
        Willie.accountWithdraw(345.98);
        Willie.getAccountBalance();
        Willie.getPhoneNumber();

        System.out.println("\n\n");

        Marsha.getCustomerName();
        Marsha.getCustomerEmail();
        Marsha.getAccountNumber();
        Marsha.accountDeposit(367.79);
        Marsha.getAccountBalance();
        Marsha.accountWithdraw(345.98);
        Marsha.getAccountBalance();
        Marsha.getPhoneNumber();
    }
}
