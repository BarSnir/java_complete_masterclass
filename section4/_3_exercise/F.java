package section4._3_exercise;

public class F {
    public static void main(String[] args){
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int firstInt, int SecondInt, int thirdInt){
        return (firstInt+SecondInt) == thirdInt;
    }
}
