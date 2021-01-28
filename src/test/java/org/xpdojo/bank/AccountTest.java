package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountHaveBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositingAnAmount() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void depositMultipleAmountsIncreasesBalance() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance()).isEqualTo(300);
    }

    @Test
    public void withdrawAmountReducesBalance() {
        Account account = new Account(100);
        account.withdraw(100);
        assertThat(account.balance()).isEqualTo(0);
    }
}
