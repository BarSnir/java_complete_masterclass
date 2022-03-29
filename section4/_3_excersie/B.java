package section4._3_excersie;
import java.lang.Math;

public class B {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        String msg = "";
        if (kiloBytes < 0 ){
            msg = "Invalid Value";
            System.out.println(msg);
            return;
        }
        double megaBytes = kiloBytes / 1024;
        int megabytesWithoutReminder = (int)(Math.floor(megaBytes));
        int megaReminder = kiloBytes%1024;
        int kbReminder = (int)(megaReminder);
        msg = kiloBytes+" KB = "+ megabytesWithoutReminder +" MB and "+kbReminder+" KB";
        System.out.println(msg);
    }
}
