    public class work5{ 
	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
		double sum= 0;
		int cnt = 0;
		cnt = in.nextInt();
		if(cnt>0){
			int[] number = new int [cnt];
			for(int i = 0;i<number.length;i++){
				number[i] = in.nextInt();
				sum += number[i];
			}
			double avr = sum*1.0/cnt;
			for(int i = 0;i<number.length;i++){
				if(number[i]>avr){
					System.out.println(number[i]);
				}
			}
		}
	}
    }