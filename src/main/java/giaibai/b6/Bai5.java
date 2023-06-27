package giaibai.b6;

import giaibai.b6.dto.BankAccount;

public class Bai5 {
    public static void main(String[] args) {

        // BankAccount
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
    }
}
