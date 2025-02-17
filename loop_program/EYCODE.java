import java.util.*;
class EYCODE 
{
	public static void main(String [] args)
	{
		String a = "b.bb.bbb...b...b";
		
		String[] str = new String[]{"b","bb","bbb","b","b"};

		Arrays.sort(str);
		String s = "";
		int cnt=0;
		for (int i=0;i<str.length ;i++ ) {
			if(s!=str[i])
			{
				cnt++;
				s=str[i];
			}
		}
		System.out.print(cnt);
	}
}