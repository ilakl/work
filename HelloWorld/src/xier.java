public class xier {
	public static void main (String args[]) {
	    int [] a = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36}; 
        int b = 1;
        while (b < a.length/3) {
            b = b * 3 + 1;
        }
        while (b > 0) {
            for (int i = b; i < a.length; i++) {
                int tmp = a[i];
                int j = i - b;
                while (j >= 0 && a[j] > tmp) {
                    a[j + b] = a[j];
                    j -= b;
                }
                a[j + b] = tmp;
            }
            b = (int) Math.floor(b / 3);
        }
    	for(int c=0;c<a.length;c++){
    	    System.out.print(a[c]+",");
    	}
    }
}
