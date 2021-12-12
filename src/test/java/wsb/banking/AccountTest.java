package wsb.banking;

import org.junit.jupiter.api.Assertions;


class AccountTest {
    private Account accountWithMoney;
    private Account accountWithoutMoney;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.accountWithMoney = new Account(500);
        this.accountWithoutMoney = new Account();

    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        Assertions.assertEquals(500,this.accountWithMoney.getBalance());
        Assertions.assertEquals(0,this.accountWithoutMoney.getBalance());
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        accountWithMoney.deposit(500);
        accountWithoutMoney.deposit(100);

        Assertions.assertEquals(1000,accountWithMoney.getBalance());
        Assertions.assertEquals(100,accountWithoutMoney.getBalance());
    }

    @org.junit.jupiter.api.Test
    void testDepositNegativeAmmount() {
        accountWithoutMoney.deposit(-100);
        accountWithMoney.deposit(-10000);

        Assertions.assertEquals(0,accountWithoutMoney.getBalance());
        Assertions.assertEquals(500,accountWithMoney.getBalance());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Assertions.assertEquals(100,accountWithMoney.withdraw(100));
        Assertions.assertEquals(0,accountWithoutMoney.withdraw(100));
    }

    @org.junit.jupiter.api.Test
    void testWithdrawNegativeAmmount() {
        Assertions.assertEquals(0, accountWithoutMoney.withdraw(-100));
        Assertions.assertEquals(0,accountWithMoney.withdraw(-100));
    }

}