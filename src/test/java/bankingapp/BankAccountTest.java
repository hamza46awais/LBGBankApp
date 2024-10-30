package bankingapp;

import com.lbg.bankingapp.BankAccount;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    @Test
    public void testDeposit() {

    }

    @Test
    public void testWithdraw() {
        BankAccount b1 = new BankAccount("Hamza", 100.23, 0);

        boolean result = b1.withdraw(50.23);
        assertThat(50.0, closeTo(b1.getBalance(), 0.005));
        assertTrue(result);

        result = b1.withdraw(51);
        assertThat(50.0, closeTo(b1.getBalance(), 0.005));
        assertFalse(result);

        result = b1.withdraw(50);
        assertTrue(result);
        assertThat(0.0, closeTo(b1.getBalance(), 0.005));
    }

}
