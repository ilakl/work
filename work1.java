import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year1=input.nextInt();
        int year2=100;
        int a=1;
        int sum = 0;
        for (year1=1970;a<=year2 ;year1++,a++) {
            //判断闰年
                        if (year1 % 400 == 0 || (year1 % 4 == 0 && year1 % 100 != 0)) {
            //闰年个数加一
                            sum=sum+1;
                            System.out.println(year1);
                        }
                    }
    }
}