package Day4_Operator;

public class Topic5a_PrePostConditions {
    public static void main(String[] args) {
        int a = 46;
        int b = 43;
        System.out.println(a+b);

        // ++ is increment which is increasing by 1
        int num = 56;
        System.out.println(num++); // this saying print and then increase so after the simi colon the value changed.
        // variables ++ is post condition//
        int num2 = 23;
        num2++; // if need to change value the new need to be before simi colon.
        System.out.println(num2++);// this wont execute becuse the value is added to after sime colon
        System.out.println(num2);

        //++ variable increase and assign
        int num3 = 81;
        System.out.println(++num3);// this will add right away cut its before the value ++num3

        //(--) decrement  decreasing numbers

        int num4 = 63;
        System.out.println(num4--);

        int num5 =37;
        System.out.println(--num5);

    }
}
