package section4._3_exercise;

public class D {
    public static void main(String[] args){
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(-1600));
    }

    public static boolean isLeapYear(int year){
        double doubleYear = (double)(year);
        if (year < 1 || year > 9999) {
            return false;
        }
        boolean isDividedByFour = ((doubleYear/4)%1 == 0);
        boolean isDividedByHundred = ((doubleYear/100)%1 == 0);
        boolean isDividedByFourHundred = ((doubleYear/400)%1 == 0);
        return (isDividedByFour && !isDividedByHundred) || 
        (isDividedByHundred && isDividedByFourHundred);
    }
}
