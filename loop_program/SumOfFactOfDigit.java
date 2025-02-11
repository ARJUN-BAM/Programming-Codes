package loop_program;

import java.util.Scanner;
public class SumOfFactOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int num = new Scanner(System.in).nextInt();
        int dup = num;
        int sum = 0;
        while(dup>0)
        {
            int rem = dup%10;
            int fact =1;
            if(rem%2==1)
            {
                for(int i = rem ; i>=1;i--)
                {
                    fact *= i;
                }
                sum += fact;
               
            }
            
            dup/=10;
        }
        System.out.println(sum);
    }
}
