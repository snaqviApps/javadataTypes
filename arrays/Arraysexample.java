package arrays;

public class Arraysexample {
    public static void main(String[] args){
        int a[];
        int[] b;

        a = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 50;
        a[3] = 40;
        a[4] = 80;

        for (int i = 0; i < a.length; i++)
            System.out.println("Value of a[" + i + "] : " + a[i]);

        int c[] = new int[5];
        System.out.println();
        int d[] = new int[]{1,2,3,4,5};

        for (int i = 0; i < d.length; i++)
            System.out.println("Value of d[" + i + "] : " + d[i]);
    }
}