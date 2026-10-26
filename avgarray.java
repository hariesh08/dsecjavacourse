package dsecjavacourse;

public class avgarray{
    public static void main(String[] args){
        int[] a={50,30,70,20,80};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int avg=(sum/a.length);
        System.out.println("the avg of array is "+avg);
    }
}
