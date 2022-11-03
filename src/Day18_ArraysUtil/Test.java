package Day18_ArraysUtil;

public class Test {
    public static void main(String[] args) {
        String name = "NAWRAS IS IN MY CLASS";
        String sub = name.substring(16,21);// even tho there is no index 21 we still need to put one extra to get the last S for the CLASS
        System.out.println("This is sub "+sub);
    }
}
