package collection;

import java.util.*;

public class QueueImplementations {

//    public static void main(String... args) throws MyNoSuchFieldException {     /** not a very good approach, delegating throw to other object */
    public static void main(String... args) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        Vector<Integer> vector = new Vector<>();
        for (int i = 9; i >= 5; i--) {
            pQueue.add(i);                   // populating 10 to 1, but pQueue will 'auto-sort' its members
            vector.add(i);
        }

        System.out.println("pQueue-members using plain-object: " + pQueue);
        System.out.println("vector-members using plain-object: " + Arrays.toString(vector.parallelStream().toArray()));
        System.out.println("===============================\n");
        vector.stream().forEachOrdered(i ->
                System.out.println("vector-members using forEachOrdered(): " + i.doubleValue()));
        System.out.println("--------------------------------");
        pQueue.forEach(i ->
                System.out.print("pQueue-members using forEach(): " + i + "\t"));
        System.out.println("===============================\n");

        Iterator<Integer> integerIterator = pQueue.iterator();
        while (integerIterator.hasNext()) {
            System.out.println("using IntegerIterator(): " + pQueue.poll());
        }

        // throw exception approach
//        if (pQueue.iterator().hasNext()) {
//            System.out.println("still pQueue has data: " + pQueue.poll());
//        } else {
//            throw new MyNoSuchFieldException("Custom-Exception thrown: pQueue is empty !!! ");
//        }

        // try - catch approach: Nicer as it doesn't delegate other objects to deal with it
        try {
            pQueue.remove();                    // program flow does not stop
        } catch (NoSuchElementException e) {
            System.out.println("inside catch block, with thrown exception-info:  " + e);
            e.printStackTrace();
        }

        System.out.println("post Exception thrown poll() call: " + pQueue.poll());
        System.out.println("post Exception thrown poll() II call: " + pQueue.poll());
        System.out.println("post Exception thrown poll() III call: " + pQueue.poll());

    }
}

class MyNoSuchFieldException extends Throwable {
    public MyNoSuchFieldException(String err) {
        System.out.println("using manual exception-throw approach: " + err);
    }
}
