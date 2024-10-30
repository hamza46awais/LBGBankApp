package bankingapp;

import com.lbg.bankingapp.BankAccount;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    @Test
    public void testDepositPositiveAmountTrue() {
        BankAccount b1 = new BankAccount("Neva", 10000.4, 0);

        boolean result = b1.deposit(100);
        assertThat(10100.4, closeTo(b1.getBalance(), 0.005));
        assertTrue(result);
    }

    @Test
    public void testDepositNegativeAmountFalse() {
        BankAccount b1 = new BankAccount("Neva", 10000.4, 0);

        boolean result = b1.deposit(-100);
        assertThat(10000.4, closeTo(b1.getBalance(), 0.005));
        assertFalse(result);
    }

    @Test
    public void testDepositZeroAmountFalse() {
        BankAccount b1 = new BankAccount("Neva", 10000.4, 0);

        boolean result = b1.deposit(0);
        assertThat(10000.4, closeTo(b1.getBalance(), 0.005));
        assertFalse(result);
    }

    @Test
    public void testWithdrawPositiveAmountTrue() {
        BankAccount b1 = new BankAccount("Hamza", 100.23, 0);

        boolean result = b1.withdraw(50.23);
        assertThat(50.0, closeTo(b1.getBalance(), 0.005));
        assertTrue(result);
    }

    @Test
    public void testWithdrawPositiveAmountFalse() {
        BankAccount b1 = new BankAccount("Hamza", 100.23, 0);

        boolean result = b1.withdraw(101);
        assertThat(100.23, closeTo(b1.getBalance(), 0.005));
        assertFalse(result);
    }

    @Test
    public void testWithdrawNegativeAmountFalse() {
        BankAccount b1 = new BankAccount("Hamza", 100.23, 0);

        boolean result = b1.withdraw(-123);
        assertThat(100.23, closeTo(b1.getBalance(), 0.005));
        assertFalse(result);
    }

    @Test
    public void testWithdrawMaximumAmount() {
        BankAccount b1 = new BankAccount("Hamza", 50, 0);

        boolean result = b1.withdraw(50);
        assertTrue(result);
        assertThat(0.0, closeTo(b1.getBalance(), 0.005));
    }

}
