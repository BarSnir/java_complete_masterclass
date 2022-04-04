package section4._3_exercise;

public class K {
    public static void main(String[] args){}

    public static boolean isCatPlaying(boolean isSummer, int temperature){
        int isPlayingTemp = 35;
        if (isSummer){
            isPlayingTemp = 45;
        }

        if (temperature >= 25 && temperature <= isPlayingTemp){
            return true;
        }
        return false;
    }
}
