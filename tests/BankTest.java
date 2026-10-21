public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.create("a"); bank.create("b");
        bank.deposit("a", 500);
        bank.transfer("a", "b", 200);
        if (bank.balance("a") != 300 || bank.balance("b") != 200) throw new AssertionError("Transfer incorrect");
        try { bank.withdraw("a", 1000); throw new AssertionError("Overdraft allowed"); }
        catch (IllegalArgumentException expected) { }
        if (bank.balance("a") != 300) throw new AssertionError("Balance changed on failed withdrawal");
        System.out.println("Bank tests passed");
    }
}
