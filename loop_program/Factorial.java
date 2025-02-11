package loop_program;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = new Scanner(System.in).nextInt();
        for(int i = 1; i<=(num/2);i++)
        {
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}
