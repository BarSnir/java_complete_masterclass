package section3.C_Primitive_Types;


public class PrimitiveTypes {
    public static void main(String[] args){
        System.out.println("Welcome");
        // int, it can be septate by underscore
        int myValue = 1_0_0_0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("Integer min value is: "+min);
        System.out.println("Integer max value is: "+max);
        System.out.println("and the value is: "+myValue);
        // overflow types (bigger than max)
        System.out.println("Integer something wrong here: "+(myValue + max));
        // This is underflow (smaller then min)
        System.out.println("Integer something wrong here: "+(-myValue + min));
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte min: "+ myMinByte);
        System.out.println("Byte max: "+ myMaxByte);
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short min: "+ myMinShort);
        System.out.println("Short max: "+ myMaxShort);
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        // for declaring lateral_long_value
        long myLongValue = 100_100_100_100_200_200L;
        System.out.println("Long min: "+ myMinLong);
        System.out.println("Long max: "+ myMaxLong);
        System.out.println("Value is: "+ myLongValue);
        // byte is 8 bit
        // short is 16 bit
        // int is 32 bit
        // long is 64 bit
        // more storage!
    }
} 