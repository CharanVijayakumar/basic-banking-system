import java.util.HashMap;
import java.util.Map;

public final class Bank {
    private final Map<String, Long> balances = new HashMap<>();

    public void create(String account) {
        if (account == null || account.isBlank() || balances.containsKey(account)) throw new IllegalArgumentException("Invalid or duplicate account");
        balances.put(account, 0L);
    }
    public long balance(String account) {
        Long amount = balances.get(account);
        if (amount == null) throw new IllegalArgumentException("Unknown account");
        return amount;
    }
    public void deposit(String account, long cents) {
        if (cents <= 0) throw new IllegalArgumentException("Amount must be positive");
        balances.put(account, Math.addExact(balance(account), cents));
    }
    public void withdraw(String account, long cents) {
        if (cents <= 0 || balance(account) < cents) throw new IllegalArgumentException("Invalid or insufficient funds");
        balances.put(account, balance(account) - cents);
    }
    public void transfer(String from, String to, long cents) {
        if (from.equals(to) || cents <= 0) throw new IllegalArgumentException("Invalid transfer");
        long source = balance(from);
        long target = balance(to);
        if (source < cents) throw new IllegalArgumentException("Insufficient funds");
        long updated = Math.addExact(target, cents);
        balances.put(from, source - cents);
        balances.put(to, updated);
    }
}
