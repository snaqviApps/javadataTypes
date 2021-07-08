package challenge.hackerrank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Hacker Rank Challenges
 *
 * 1. Sales by Match
 *
 */

public class AlgosMisc {

    public static void main(String... args) {

        System.out.println("Duplicate entries in List ");
        System.out.println("======================");

        List<Integer> dupData = new ArrayList<>(Arrays.asList(
                10, 20, 20, 10, 10, 30, 50, 30, 30, 30)                           // pass

  );
        System.out.println("findDuplicates() output: " + findDuplicates(dupData.size(), dupData));

    }

    public static int findDuplicates(int n, List<Integer> ar) {

        final int[] count = {0};
        int[] countCk = new int[2];

        final Set<Integer> setToReturn = new HashSet<>();
        final Set<Integer> set1 = new HashSet<>();

        if ((n <=100 && n >=1) && (ar.size() >=1 && ar.size() <= 100)) {
            ar.forEach(i -> {
                        if (!set1.add(i)) {
                            setToReturn.add(i);                         // so far 66.66 % success
                            count[0]++;
                            if(count[0] % 2 == 0 || count[0] == 1) {
                                countCk[0]++;
                            }
                        }
                    }
            );
        }

         System.out.println("duplicate members found using HashSet saved: " + Arrays.toString(setToReturn.toArray()));

        if(set1.contains(65)) System.out.println("'contains()' checks if set1 contains a number, here:  '65'");

        return countCk[0];
    }
}

