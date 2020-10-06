package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account a = new Account();
        assertThat(a.balance()).isEqualTo(0);
    }

    @Test
    public void depositingAmountShouldIncreaseBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void multipleDepositsShouldIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(20);
    }
}
