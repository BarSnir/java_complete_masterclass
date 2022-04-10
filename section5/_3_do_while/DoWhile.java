package section5._3_do_while;

public class DoWhile {
    public static void main(String[] args){
        int count = 0;
        while (count != 6){
            if (count == 5){
                break;
            }
            System.out.println("A"+count);
            count++;
        }
        count = 0;
        while (count < 6){
            count++;
            if (count == 1){
                continue;
            }
            System.out.println("B"+count);
        }

        count = 0;
        do {
            System.out.println("C"+count);
            count++;
        } while(count<5);

    }


}
