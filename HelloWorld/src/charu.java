public class charu {
public static void main (String args[]) {
	int a [] = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
	int i,j;
	for(i=1;i<a.length;i++) {
		int temp=a[i];
		for(j=i-1;j>=0;j--) {
		   if (temp > a[j]) {
				break;
		   }else{
	    	   a[j+1] = a[j];
	       }
		}
		a[j+1]=temp;
	}
	for (int c=0;c<a.length;c++) {
	    System.out.print(a[c]+",");
	}
}
}
