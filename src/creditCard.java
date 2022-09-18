public class creditCard {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double interestRate = 0.17;
        double monthOne;
        double monthTwo;

        monthOne = creditCardBalance *interestRate + creditCardBalance;
        System.out.println("Your first month balance is: " + monthOne);
        monthTwo = monthOne * interestRate + monthOne;
        System.out.println("Your second month balance is:" + monthTwo);
    }
}
