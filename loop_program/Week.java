import java.util.Scanner;
class Week {
    public static void main(String[] args) {
        String[] week = {"mon","tue","wed","thu","fri","sat","sun"};
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int i =0;
        while(!s.equals(week[i]))
        {
            if(i>6)
            {
                System.out.println("Invalid");
                System.exit(0);
            }
            i++;
        }
        int cnt = 0;
        while(n>0)
        {
            if(i==6)
            {
                i=0;
            }
            else{
                i++;
            }
            if(week[i].equals("sun"))
            {
                cnt++;
            }
            n--;
        }
        System.out.println(cnt);
        
    }
}