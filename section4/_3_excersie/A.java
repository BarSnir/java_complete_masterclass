package section4._3_excersie;
import java.lang.Math;

public class A {

    public static void main(String[] args) {
        double kilometersPerHour = 95.75;
        printConversion(kilometersPerHour);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        
        long milePerHour = Math.round(kilometersPerHour / 1.609);
        return milePerHour;
    }
    
    public static void printConversion(double kilometersPerHour) {
        long value = toMilesPerHour(kilometersPerHour);
        String msg = "";
        if (value < 0) {
            msg = "Invalid Value";
        } else {
            msg = kilometersPerHour+" km/h = "+ value +" mi/h";
        }

        System.out.println(msg);
    }
}

