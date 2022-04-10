package section5._1_switch;

public class Switch {
    public static void main(String[] args){
        String value = "e";
        switch (value.toUpperCase()){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            case "c": case "d": case "E":
                System.out.println("c or d or e");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
