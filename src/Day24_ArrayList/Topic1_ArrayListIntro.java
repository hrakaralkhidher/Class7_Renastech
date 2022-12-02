package Day24_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Topic1_ArrayListIntro {
    public static void main(String[] args) {
        int [] MyOldArray = new int[3];

        MyOldArray[0] = 55;
        MyOldArray[1] = 47;
        MyOldArray[2] = 99;

        String [] MyOldSringArray = {"food","family","expense"};

        /*
        In java we need to declare the size of an array before we can use it.
        ones size is declared, it is hard to change

        to handdle this issue, we can use ArrayList class.
         */

        ArrayList<Integer> MyNewArray = new ArrayList<Integer>();

        /*
            Basic Operation on ArrayList

            Add elements
            Access (get) elements
            change (set) elements
            Remove elements
         */
        MyNewArray.add(55);
        MyNewArray.add(47);
        MyNewArray.add(99);
        MyNewArray.add(108);

        System.out.println(MyNewArray);

        //[55, 47, 99, 108]
        MyNewArray.add(2,77);
        System.out.println(MyNewArray);

        MyNewArray.add(0,11);
        System.out.println(MyNewArray);

    }
}
