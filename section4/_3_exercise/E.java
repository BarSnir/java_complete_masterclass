package section4._3_exercise;

public class E {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(
        double firstDouble,
        double secondDouble
    ){
        if(firstDouble > 0) {
            firstDouble = Math.floor(firstDouble * 1000);
        } else {
            firstDouble = Math.ceil(firstDouble * 1000);
        }

        if(secondDouble > 0) {
            secondDouble = Math.floor(secondDouble * 1000);
        } else {
            secondDouble = Math.ceil(secondDouble * 1000);
        }
        return firstDouble == secondDouble;
    }
}
