

class Main {
    public static void main(String[] args) {
        for(int i=30;i<=1000;i++)
        {
          if(tectNumber(i))
          System.out.println(i);
        }    
        // System.out.println(tectNumber(42));   
    }
    public static boolean isPrime(int num)
    {
        if(num<2)
        return false;
        for(int i = 2;i<=num/2;i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
    public static int nextPrime(int num){
        num++;
        while(!isPrime(num))
        {
            num++;
        }
        return num;
        
    }
    public static boolean tectNumber(int num)
    {
        int hemp = 1, temp=2, dup=num,i=1;
        if(isPrime(num))
        return false;
        for( i=1;i<=3;i++)
        {
            if(num%temp==0)
            {
                if(hemp%temp==0)
                return false;
                hemp*=temp;
                // System.out.print(temp + " ");
                num/=temp;
                temp = 2;

             }
            else{
                temp=nextPrime(temp);
                // System.out.print("temp : "+temp);
                if(temp>dup/2)
                {
                    break;
                }
                i--;
            }
            // System.out.print("i = "+i+" ");
        }
        if(hemp==dup&&i==4)
        return true;
        else
        return false;
    }
}