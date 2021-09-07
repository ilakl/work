public class work2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int x=1;
		int y=1;
		int z=1;
		while(n>2) {	
		z=x+y;			
		x=y;
		y=z;
		n--;
		System.out.print(z+" ");
		}
	}
}
