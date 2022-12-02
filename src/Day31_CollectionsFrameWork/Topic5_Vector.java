package Day31_CollectionsFrameWork;

import java.util.Vector;

public class Topic5_Vector {
    public static void main(String[] args) {
        Vector<Integer> MyVector = new Vector<>();
        MyVector.add(8476);
        MyVector.add(2);
        MyVector.add(8476);
        MyVector.add(4);
        MyVector.add(1);
        MyVector.add(1);
        MyVector.add(999);
        MyVector.add(null);
        MyVector.add(1794);

        System.out.println(MyVector);

        //if someone else tries to set index 2 at the same time, he/she will get an exception
        MyVector.set(2,111);

        System.out.println(MyVector);

        /*
        In Java, ArrayList and Vector are almost the same.
            Vector is thread-safe, ArrayList is not.
            This means whenever we want to perform some operation on vectors,
            the Vector class automatically applies a lock to that operation.
            So at the same time, someone else can not change the value too.
            It is because when one thread is accessing a vector, and at the same time another thread tries to access it,
            an exception called "ConcurrentModificationException" is generated.

            **Note:  If thread safety is not important
            It is recommended to use ArrayList instead of Vector because vectors less efficient.
         */

    }
}
