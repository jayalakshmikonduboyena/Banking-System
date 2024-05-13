import java.util.Scanner;

class ATM {

    public static void main(String[] args) {
        int balance = 5000; // Initial balance
        int choice;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(balance);
                    break;
                case 2:
                    deposit(balance);
                    break;
                case 3:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient funds. Please try a lower amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Please collect your cash.");
            System.out.println("Remaining balance: $" + balance);
        }
    }

    public static void deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        int amount = scanner.nextInt();

        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }
}
