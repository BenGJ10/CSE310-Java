import java.util.Scanner;

class LoanOverdueException extends Exception {
    public LoanOverdueException(String message) {
        super(message);
    }
}

class InsufficientFundsForLoanRepaymentException extends Exception {
    public InsufficientFundsForLoanRepaymentException(String message) {
        super(message);
    }
}

class NegativeLoanRepaymentAmountException extends Exception {
    public NegativeLoanRepaymentAmountException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;
    private double loanAmount;
    private double minLoanRepayment;
    private int daysOverdue;

    public BankAccount(double balance, double loanAmount, double minLoanRepayment, int daysOverdue) {
        this.balance = balance;
        this.loanAmount = loanAmount;
        this.minLoanRepayment = minLoanRepayment;
        this.daysOverdue = daysOverdue;
    }

    public void withdraw(double amount) throws LoanOverdueException, InsufficientFundsForLoanRepaymentException, NegativeLoanRepaymentAmountException {
        if (daysOverdue > 60) {
            throw new LoanOverdueException("Loan is overdue by more than 60 days. Immediate payment required.");
        }

        if (minLoanRepayment < 0) {
            throw new NegativeLoanRepaymentAmountException("Loan repayment amount cannot be negative.");
        }

        if (balance < amount + minLoanRepayment) {
            throw new InsufficientFundsForLoanRepaymentException("Insufficient funds to cover loan repayment after withdrawal.");
        }

        balance -= (amount + minLoanRepayment);
        loanAmount -= minLoanRepayment;
    }

    public void displayAccountStatus() {
        System.out.printf("Remaining Balance: %.2f\n", balance);
        System.out.printf("Remaining Loan Amount: %.2f\n", loanAmount);
    }
}

class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = scanner.nextDouble();
        double loanAmount = scanner.nextDouble();
        double minLoanRepayment = scanner.nextDouble();
        int daysOverdue = scanner.nextInt();
        BankAccount account = new BankAccount(balance, loanAmount, minLoanRepayment, daysOverdue);

        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            account.displayAccountStatus();
        } catch (LoanOverdueException | InsufficientFundsForLoanRepaymentException | NegativeLoanRepaymentAmountException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}