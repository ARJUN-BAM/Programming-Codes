import java.util.Scanner;

public class Pratices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.SIZE);
        System.out.println(Integer.numberOfLeadingZeros(n));
        int k = (1 << (Integer.SIZE - Integer.numberOfLeadingZeros(n))) - 1;
        System.out.println(n ^ k);
    }
}