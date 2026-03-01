public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        // Interest calculation for month 1
        double interestMonth1 = balance * monthlyInterestRate;
        balance = balance + interestMonth1;
        System.out.println("The interest after one month is: $" + interestMonth1);

        // Interest calculation for month 2
        double interestMonth2 = balance * monthlyInterestRate;
        balance = balance + interestMonth2;
        System.out.println("The interest after two months is: $" + interestMonth2);
    }
}