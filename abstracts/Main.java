package abstracts;

import java.util.*;

public class Main {

    public static <T> void main(String... args) {

        Kane kane = new Kane(2, "1st-");
        kane.theMusic("Hi---Hi");
        kane.finisher();
        kane.I_finisher();
        kane.payStubs(5, kane);


        // Comparable-approach
        List<Kane> compareLists = new ArrayList<>();
                compareLists.add(new Kane(2, "K0"));
                compareLists.add(new Kane(40, "K40"));
                compareLists.add(new Kane(30, "K30"));

                Collections.sort(compareLists,
                        new Comparator<Kane>() {
                            @Override
                            public int compare(Kane o1, Kane o2) {
                                return (o1.getSize() > o2.getSize() ? 1 : -1);
                            }
                        });

                compareLists.forEach(x->
                        System.out.println(x));

    }

}

