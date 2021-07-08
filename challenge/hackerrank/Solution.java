package challenge.hackerrank;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> grades = Arrays.asList(67, 73);
        List<Integer> result = Result.gradingStudents(grades);
//        grades.forEach(x -> System.out.println("grades: " + x));            // collections-noStream()
//        result.stream().forEach(x -> System.out.println("results: " + x));  // stream-based

       Result.countApplesAndOranges(
                7, 11,5, 15,
               Arrays.asList(-2, 2, 1),
               Arrays.asList(5, -6)
        );

    }


    public static class Result {

        public static List<Integer> gradingStudents(List<Integer> grades) {

//          List<Integer> results  = grades.stream()
//                    .filter(x-> x >= 38)
//                    .collect(Collectors.toList());
            Iterator<Integer> gradesTemp = grades.iterator();
            List<Integer> finalResult = new ArrayList<Integer>();
            while (gradesTemp.hasNext()) {
                int temp = gradesTemp.next();
                int rTemp = (int) (Math.ceil(temp / 5d) * 5);

                if ((temp >= 38) && (rTemp - temp < 3)) {
                    finalResult.add(rTemp);
                } else {
                    finalResult.add(temp);
                }
            }
            return finalResult;
        }

        // Second HackerRank_ChallengeApple and Oranges
        public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    /*
            Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

            In the diagram below:

            The red region denotes the house, where  is the start point, and  is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
                    Assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .
            When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. *A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right. *
            Apple and orange(2).png

            Given the value of  for  apples and  oranges, determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )?

            For example, Sam's house is between  and . The apple tree is located at  and the orange at . There are  apples and  oranges. Apples are thrown  units distance from , and  units distance. Adding each apple distance to the position of the tree, they land at . Oranges land at . One apple and two oranges land in the inclusive range  so we print
    */
            // Write your code here

            //                    .reduce(0, Integer::sum);
            int numA = (int) apples.stream()
                    .map(x -> x + a)
                    .filter(x -> x >= s)
                    .filter(x -> x <= t).count();       // another terminal-function

            System.out.println(numA);

            int numO = oranges.stream()
//            oranges.stream()
                    .map(x-> x + b)
//                    .forEach(System.out::println);
                    .filter(x -> x >= s)
                    .filter(x -> x <= t)
//                    .reduce(0, (subtotal, x) -> subtotal + x
            .collect(Collectors.toList()).size();
            System.out.println(numO);
        }

    }

}


