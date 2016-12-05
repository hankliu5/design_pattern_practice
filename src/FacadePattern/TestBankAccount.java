package FacadePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(1000.00);
        accessingBank.depositCash(200.00);
    }
}
