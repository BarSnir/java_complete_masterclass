package section3.E_Floats_Doubles;
import java.util.Scanner;

public class FloatsDoubles {
    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Max float - Min Float: " + (maxFloat - minFloat));

        Double minDouble = Double.MIN_VALUE;
        Double maxDouble = Double.MAX_VALUE;
        System.out.println("Max Double - Min Double: " + (maxDouble - minDouble));



        int myIntValue = 1;
        float myFloatValue = (float)5.25;
        Double myDoubleValue = 5.25d;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter pounds weight");
        int pounds = input.nextInt();
        input.close();

        calc(myIntValue, myFloatValue, myDoubleValue);
        double kilograms = calcKilograms(pounds);
        System.out.println(pounds + " pounds are: "+ kilograms+ " Kilograms");
    }

    public static void calc(int intValue, float floatValue, double doubleValue) {
        System.out.println(intValue + floatValue  + doubleValue);
    }

    public static double calcKilograms(int pounds){
        double conversion = 0.453592;
        return conversion * pounds;
    }
}
