package wsb.banking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CustomerTest {
    Customer johnDoe;
    Customer janKowalski;

    @BeforeEach
    void setUp() {
        johnDoe = new Customer("John","Doe");
        janKowalski = new Customer("Jan", "Kowalski");
    }

    @Test
    void getAccount() {
        Assertions.assertEquals(0,johnDoe.getAccount().getBalance());
        Assertions.assertEquals(0,janKowalski.getAccount().getBalance());
    }

    @Test
    void setAccount() {
        Account accountToSet = new Account(500);

        johnDoe.setAccount(accountToSet);

        Assertions.assertEquals(500,johnDoe.getAccount().getBalance());
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("John",johnDoe.getFirstName());
        Assertions.assertEquals("Jan",janKowalski.getFirstName());
    }

    @Test
    void setFirstName() {
        johnDoe.setFirstName("Chris");
        janKowalski.setFirstName("Krzysztof");

        Assertions.assertEquals("Chris",johnDoe.getFirstName());
        Assertions.assertEquals("Krzysztof",janKowalski.getFirstName());
    }

    @Test
    void getLastName() {
        Assertions.assertEquals("Doe",johnDoe.getLastName());
        Assertions.assertEquals("Kowalski",janKowalski.getLastName());
    }

    @Test
    void setLastName() {
        johnDoe.setLastName("Smith");
        janKowalski.setLastName("Nowak");

        Assertions.assertEquals("Smith",johnDoe.getLastName());
        Assertions.assertEquals("Nowak",janKowalski.getLastName());
    }

    @Test
    void testBalanceAfterWithdrawal() {
        Account accountToSet = new Account(500);
        johnDoe.setAccount(accountToSet);

        johnDoe.getAccount().withdraw(150);
        Assertions.assertEquals(350,johnDoe.getAccount().getBalance());

        johnDoe.getAccount().deposit(22.50);
        Assertions.assertEquals(372.50, johnDoe.getAccount().getBalance());

        johnDoe.getAccount().withdraw(47.62);
        Assertions.assertEquals(324.88,johnDoe.getAccount().getBalance());

        Assertions.assertEquals(0,johnDoe.getAccount().withdraw(500));

    }
}