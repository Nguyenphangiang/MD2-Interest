import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter number of month:");
        int month = scanner.nextInt();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest = loanAmount * (interestRate/100)/12 * month;
        }
        System.out.println("Total interest : " + totalInterest);
    }
}
