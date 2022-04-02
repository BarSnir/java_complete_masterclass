package section4._3_exercise;

public class G {
    public static void main(String[] args){
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int firstInt, int secondInt, int thirdInt){
        return isTeen(firstInt) || 
        isTeen(secondInt) || 
        isTeen(thirdInt);
    }

    public static boolean isTeen(int number){
        return number > 12 && number < 20;
    }
}
