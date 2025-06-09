sealed class Parent permits SuperBase {
    public static int a = 100;

    public static void main(String[] args) {
        System.err.println(a);
    }
}

public final class SuperBase extends Parent {

}
