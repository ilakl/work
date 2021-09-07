public class work3{
    public static int gcd(int a,int b) {
		int gcd = 0,c;                       
		if(a > b) 
		{
			while(b != 0)
           {
				a = a % b;                   
				if(a < b)
				{
				c = a;
				a = b;
				b = c;
				}
				gcd = a;
			}
		}
		if(a == b)
			gcd = a;
		else 
		{
			c = a;a = b;b = c;
			while(b != 0)
	        {
				a = a % b;
				if(a < b){c = a;a = b;b = c;}
				gcd = a;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner zs = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = zs.nextInt();
		
		System.out.print("请再输入一个整数：");
		int b = zs.nextInt();
		
		int c = gcd(a,b);
		System.out.println("最大公因数是："+c);
	}
}

}