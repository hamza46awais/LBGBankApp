package bankingapp;

import com.lbg.bankingapp.BankAccount;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BankAccountTest {
    @Test
    public void testDeposit() {

    }

    @Test
    public void testWithdraw() {
        BankAccount b1 = new BankAccount("Hamza", 10023, 0);
        double amount = 50.35;

        b1.withdraw(50);

        assertThat(50.23, closeTo());


        b1.withdraw(51);

    }

}
