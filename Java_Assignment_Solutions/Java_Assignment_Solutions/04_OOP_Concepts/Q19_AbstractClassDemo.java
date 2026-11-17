// Abstract class representing a general real-world Payment
abstract class Payment {
    // Common field
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method implemented differently by each child
    public abstract void pay();

    // Concrete method shared by all children
    public void printReceipt() {
        System.out.printf("Receipt: Payment of Rs. %.2f processed successfully.%n", amount);
        System.out.println("--------------------------------------------------");
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Paying Rs. " + amount + " using Credit Card (" + cardNumber + ").");
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Paying Rs. " + amount + " via UPI ID: " + upiId + ".");
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Collecting Rs. " + amount + " in Cash at the counter.");
    }
}

public class Q19_AbstractClassDemo {
    public static void main(String[] args) {
        // Store all objects in one array of the parent type
        Payment[] payments = new Payment[3];
        payments[0] = new CreditCardPayment(1500.00, "XXXX-XXXX-XXXX-4321");
        payments[1] = new UPIPayment(650.50, "ravi@upi");
        payments[2] = new CashPayment(300.00);

        // Call methods using a loop
        for (Payment p : payments) {
            p.pay();
            p.printReceipt();
        }
    }
}
