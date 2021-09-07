public class work6{
    static int a[]=new int[20];
    void number(){
        for(int i=0;i<20;i++){
            a[i]=(int)(Math.nextInt(383) + 77);
        }
    }
    //方法maxnum获取数组最大值
    int maxnum(){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    int minnum(){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
   int sumnum(){
        int avg,sum;
        sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
     void printing(){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }
    }
    public static void main(String args[]){
        Intnumber stern=new Intnumber();
        stern.number();
        stern.printing();
        System.out.println();
        System.out.println("the max number is "+stern.maxnum());
        System.out.println("the min number is "+stern.minnum());
        System.out.println("the avg number is "+stern.sumnum());
    }
}