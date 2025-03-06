package loop_program;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter your Number : ");
        int num = new Scanner(System.in).nextInt();
        int count=0;
        for(int i =2 ; i<=(num/2);i++)
        {
            if(num%i==0)
            {
                System.out.print(num+" is not a Prime");3
                System.exit(0);
            }
        }
        System.out.print(num+" is a Prime");

    }
}
