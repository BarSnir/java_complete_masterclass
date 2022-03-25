package section3._9_Challenge;

public class Challenge {
    
    public static void main(String[] args){
        double firstDouble = 20.0;
        double secondDouble = 80.0;
        double result = (firstDouble + secondDouble) * 100;
        result %= 40.0;

        boolean isNotReminder = result == 0 ? true : false;
        System.out.println(isNotReminder);
        
        if (!isNotReminder)
            System.out.println("Got some reminder");

    }
}
