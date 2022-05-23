public class Warehouse {
    private double capacity;
    private double balance;
    private String name;
    
    public Warehouse(double capacity) {
        if (this.capacity <= 0) {
            this.capacity = 0;
        }
        this.capacity = capacity;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getCapacity() {
        return this.capacity;
    }
    public double howMuchSpaceLeft() {
        return this.capacity -= this.balance;
    }
    public void addToWarehouse(double amount) {
        if (amount + this.balance > this.capacity) {
            this.balance = this.capacity;
        }
        if (amount < 0) {
            this.balance += 0;
        }
        this.balance += amount;
    }
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount > this.capacity) {
            this.balance = 0;
            return this.capacity;
        }
        return this.balance -= amount;
    }
    public String toString() {
        return "Balance = " +  String.format("%,.2f", getBalance()) + ", space left: " + String.format("%,.2f", getCapacity() - getBalance());
    }
}
