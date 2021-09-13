public class maopao {
		public static void main (String args[]) {
	    int [] a = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36}; 
	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = 0; j < a.length - i- 1; j++) {
	                if (a[j] > a[j+1]) {
	                    // ½»»»a[j]ºÍa[j+1]:
	                    int b = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = b;
	                }
	            }
	        }
	for(int c=0;c<a.length;c++){
	    System.out.print(a[c]+",");
	}
	}
	}

