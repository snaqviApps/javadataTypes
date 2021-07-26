package generics;

public class MyGenerics {

    static class TestGenerics {
        public <T> void testGenerics(T t){
            System.out.println(t.getClass().getName() + " = " + t);
        }

        public <U, V> void testGenericsTwo(U u, V v) {
            System.out.println(u.getClass().getName() + " = " + u + "\n2nd-generic-input: = " + v + ", input type: " + v.getClass().getName());
        }
    }

    public static void main(String... arg) {

        TestGenerics testGenerics = new TestGenerics();
        testGenerics.testGenerics(15);
        testGenerics.testGenerics("Hi-Generics");
        System.out.println("===============================");

        testGenerics.testGenericsTwo(25, 12.5);
        testGenerics.testGenericsTwo(25, " 'just printed' ");
    }

}
