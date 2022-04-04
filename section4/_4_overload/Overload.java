package section4._4_overload;

public class Overload {
    public static void main(String[] args){
        System.out.println(customerOverloadFunc(1,2));
        System.out.println(customerOverloadFunc(1));
        System.out.println(customerOverloadFunc(1, 2, 3));
    }

    public static int customerOverloadFunc(int first, int second){
        return (first+second)*1000;
    }

    public static int customerOverloadFunc(int first){
        return (first)*1000;
    }

    public static int customerOverloadFunc(int first, int second, int third){
        return (first+second+third)*1000;
    }
}
