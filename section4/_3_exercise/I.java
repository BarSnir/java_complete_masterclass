package section4._3_exercise;

public class I {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(581760);
    }

    public static void printYearsAndDays(long minutes){
        String msg = "";
        if (minutes < 0){
            msg = "Invalid Value";
            System.out.println(msg);
            return;
        }
        double hours = (double)(minutes / 60);
        double days = hours/24;
        double years = days/365;

        int yearsFloor = (int) Math.floor(years);
        int daysReminder = (int) Math.round(((years%1)*365));
        msg = minutes+" min = "+yearsFloor+" y and "+daysReminder+" d";
        System.out.println(msg);
    }
}
