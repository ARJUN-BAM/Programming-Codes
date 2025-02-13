// 1 3 9 33 153 873
// (1 + )  (3+1*6) (9+4*6)   (33+20*6) (153+120*6)
// 1 (1 +1*2) (3+3*2) (9+12*2)   (33+60*2) (153+360*2)

class Series3
{
	public static void main(String[] args) {
		int sum = 1;
		System.out.print(sum+" ");
		int temp = 3;
		int t = 1;
		while(temp<8)
		{
			sum = sum + (t)*2;
			System.out.print(sum + " ");
			t=t*(temp++);
		}
			
		
	}
}