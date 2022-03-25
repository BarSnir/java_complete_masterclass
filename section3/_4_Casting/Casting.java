package section3._4_Casting;

public class Casting {
    public static void main(String[] args){
        // Casting overflowed type to byte
        byte myNewByte = (byte)(10 * 200);
        System.out.println(myNewByte);

        // Challenge
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));
        short totalShort = (short)(
            1000 + 10 * (myByte + myShort + myInt)
        );
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(totalShort);
    }
}
