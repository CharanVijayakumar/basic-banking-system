public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.create("checking");
        bank.create("savings");
        bank.deposit("checking", 10000);
        bank.transfer("checking", "savings", 2500);
        System.out.println("Checking cents: " + bank.balance("checking"));
        System.out.println("Savings cents: " + bank.balance("savings"));
    }
}
