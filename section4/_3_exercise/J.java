package section4._3_exercise;

public class J {
    public static void main(String[] args){
        printEqual(1, 1, 1);
        printEqual(1, 0, 1);
        printEqual(2, 0, 1);
        printEqual(-1, 0, 1);
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 ||  third < 0){
            System.out.println("Invalid Value");
            return;
        } else if (first == second  &&  second == third && third == first){
            System.out.println("All numbers are equal");
            return;
        } else if (first != second  &&  second != third && third != first){
            System.out.println("All numbers are different");
            return;
        } else {
            System.out.println("Neither all are equal or different");
            return; 
        }
    }
}
