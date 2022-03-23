package section3.G_Strings;

public class Strings {
    public static void main(String[] args){
        String myString = "hello world";
        myString = myString + "\nmore strings";
        myString = myString + "\u00A9";
        System.out.println(myString);
        String numberString = "50";
        numberString = numberString + "50";
        int realNum = 1;
        System.out.println("Is 50 + 50 equals 100? " + numberString + realNum);
    }
}
