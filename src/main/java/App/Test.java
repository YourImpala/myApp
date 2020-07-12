package App;

public class Test {

    static class A extends B {
        static Integer q = 2;
        static {
            System.out.print("A");
            A.q = 4;
        }
    }

    static class B {
        static {
            System.out.print("B");
            A.q++;
        }
    }

    public static void main(String[] args) {
        System.out.println(A.q);
    }
}




