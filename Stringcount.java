class Stringcount{
	public static void main(String[] args)
	{
		String s = "AAAABBBCCD";
		String result = "";
		for(int i = 0;i<=26;i++)
		{
			int cnt = 0;
			for(int j = 0;j<s.length();j++)
			{
				if((char)(65+i)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>0)
				result = result + cnt +(char)(65+i);
		}
		System.out.println(result);
	}
}