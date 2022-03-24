package section3.H_Operations_Operands_Experssion;

public class OOE {
    public static void main(String[] args){
        int result = 1 + 2;
        int newResult = result + 5;
        result = newResult * (10/5);
        int reminder = newResult % 3;
        reminder++;
        reminder--;
        reminder += 3;
        reminder -= 3;
        reminder *= 3;
        reminder /= 3;
        System.out.println(reminder);

        boolean isAlien = false;
        if (isAlien == false || isAlien != true) {
            System.out.println("Not Alien");
            System.out.println(isAlien == false || isAlien != true);
        }

        if (reminder > 0 && !isAlien) {
            System.out.println(reminder > 0);
        }

    }
}
