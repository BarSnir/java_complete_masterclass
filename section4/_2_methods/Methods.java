package section4._2_methods;

public class Methods {
    public static void main(String[] args){
        String msg = "The total score is: ";
        int result = calcScore(100, 2000);
        println(msg, result);
        result = calcScore(300, 400);
        println(msg, result);
    }

    public static int calcScore(int scoreA, int scoreB){
        return scoreA * scoreB;
    }

    public static void println(String msg, int result) {
        System.out.println(msg + result);
    }
}
