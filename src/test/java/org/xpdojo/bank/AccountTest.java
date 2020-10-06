package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account a = new Account(0);
        assertThat(a.balance()).isEqualTo(0);
    }

    @Test
    public void depositingAmountShouldIncreaseBalance() {
        Account account = new Account(0);
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositsShouldIncreaseTheBalance() {
        Account account = new Account(0);
        account.deposit(10);
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void withdrawAmountShouldDecreaseTheBalance() {
        Account account = new Account(10);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void withdrawMultipleShouldDecreaseTheBalance() {
        Account account = new Account(20);
        account.withdraw(10);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(0);
    }

}
