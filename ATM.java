import java.util.Scanner;
import javax.swing.*;


public class ATM extends MyFrame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        int choice;

        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int amount = scanner.nextInt();
                    if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= amount;
                        System.out.println(amount + " withdrawn successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextInt();
                    balance += amount;
                    System.out.println(amount + " deposited successfully.");
                    break;
                case 3:
                    System.out.println("Your balance is " + balance);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    scanner.close();
            }
        }
    }
}
public class MyFrame extends JFrame {

    public MyFrame() {
        // Create a new button
        JButton button = new JButton("Click me!");

        // Add the button to the frame
        add(button);

        // Set the layout of the frame
        setLayout(new FlowLayout());

        // Make the frame visible
        setVisible(true);
    }
}


