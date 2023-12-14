import java.util.Scanner;

public class ATMInterface {
    private String userId;
    private String userPin;

    public ATMInterface(String userId, String userPin) {
        this.userId = userId;
        this.userPin = userPin;
    }

    public void startATM() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Interface");
        System.out.print("Enter User ID: ");
        String enteredUserId = scanner.nextLine();

        System.out.print("Enter User PIN: ");
        String enteredPin = scanner.nextLine();

        if (validateUser(enteredUserId, enteredPin)) {
            System.out.println("Welcome, " + userId + "!");
            displayOptions();
            int choice = scanner.nextInt();

            while (choice != 5) {
                switch (choice) {
                    case 1:
                        TransactionsHistory();
                        break;
                    case 2:
                        Withdrawal();
                        break;
                    case 3:
                        Deposit();
                        break;
                    case 4:
                        Transfer();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                displayOptions();
                choice = scanner.nextInt();
            }

            System.out.println("Thank you for using the ATM Interface. Bye!");
        } else {
            System.out.println("Invalid User ID or PIN. Exiting...");
        }
    }

    private boolean validateUser(String enteredUserId, String enteredPin) {
        return userId.equals(enteredUserId) && userPin.equals(enteredPin);
    }

    private void displayOptions() {
        System.out.println("\nATM Menu:");
        System.out.println(" \n 1. View Transactions History \n 2.Withdraw \n 3.Deposit \n 4.Transfer \n 5.Quit \n");
        
    }

    private void TransactionsHistory() {
        System.out.println("Transaction history will be displayed here.");
    }

    private void Withdrawal() {
        System.out.println("Withdrawal functionality will be implemented here.");
    }

    private void Deposit() {
        System.out.println("Deposit functionality will be implemented here.");
    }

    private void Transfer() {
        System.out.println("Transfer functionality will be implemented here.");
    }

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface("user345", "4268"); // Sample user ID and PIN
        atm.startATM();
    }
}