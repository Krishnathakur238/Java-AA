// Interface for Anonymous Inner Class
interface Notifier {
    void notifyUser(String message);
}

// Outer class representing a real-world BankAccount
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 1. Member Inner Class: reads and modifies private fields of outer class
    class TransactionManager {
        public void deposit(double amount) {
            balance += amount;
            System.out.println("[Inner Class] Deposited Rs. " + amount + " for " + accountHolder);
            System.out.println("[Inner Class] Updated Balance: Rs. " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("[Inner Class] Withdrew Rs. " + amount + " for " + accountHolder);
                System.out.println("[Inner Class] Remaining Balance: Rs. " + balance);
            } else {
                System.out.println("[Inner Class] Insufficient balance!");
            }
        }
    }

    // 2. Static Nested Class: works without an outer object
    static class ReceiptPrinter {
        public static void printBankHeader(String bankName) {
            System.out.println("=========================================");
            System.out.println("   " + bankName.toUpperCase() + " - OFFICIAL STATEMENT");
            System.out.println("=========================================");
        }
    }

    // Method accepting an interface (used with Anonymous Inner Class)
    public void sendAlert(Notifier notifier) {
        notifier.notifyUser("Account (" + accountHolder + ") current balance is Rs. " + balance);
    }
}

public class Q21_NestedAndAnonymousClassDemo {
    public static void main(String[] args) {
        // Output 1: Static Nested Class (no outer object required)
        BankAccount.ReceiptPrinter.printBankHeader("National Trust Bank");

        // Create outer class object
        BankAccount account = new BankAccount("Ravi Kumar", 5000.00);

        // Output 2: Member Inner Class (created using the outer object)
        BankAccount.TransactionManager txManager = account.new TransactionManager();
        txManager.deposit(2000.00);
        txManager.withdraw(1200.00);

        // Output 3: Anonymous Inner Class implementing Notifier interface
        account.sendAlert(new Notifier() {
            @Override
            public void notifyUser(String message) {
                System.out.println("[Anonymous Class SMS Alert] " + message);
            }
        });
    }
}
