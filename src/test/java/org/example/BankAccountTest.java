package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1000, 0.05);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(1000, 0.05);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(1000, 0.05);
        assertThrows(IllegalStateException.class, () -> account.withdraw(1500));
    }

    @Test
    void testTransfer() {
        BankAccount account1 = new BankAccount(1000, 0.05);
        BankAccount account2 = new BankAccount(500, 0.05);
        account1.transfer(200, account2);
        assertEquals(800, account1.getBalance());
        assertEquals(700, account2.getBalance());
    }

    @Test
    void testAddInterest() {
        BankAccount account = new BankAccount(1000, 0.05);
        account.addInterest();
        assertEquals(1050, account.getBalance());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(1000, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(1000, 0.05);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500));
    }
}
