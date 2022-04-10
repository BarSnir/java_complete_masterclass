package section5._2_for_loop;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++){
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--){
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }

        
        
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
