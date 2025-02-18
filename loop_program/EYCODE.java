import java.util.*;
class EYCODE 
{
	public static void main(String [] args)
	{
		String a = "b.bb.bbb...b...b";
		
		String[] str = a.split("[.]+");

		Arrays.sort(str);
		String s = "";
		int cnt=0;
		for (int i=0;i<str.length ;i++ ) {
			if(!(s.equals(str[i])))
			{
				System.out.println(s + " : "+str[i]);
				cnt++;
				s=str[i];
			}
		}
		System.out.println();
		System.out.print(cnt);
	}
}