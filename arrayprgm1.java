package dsecjavacourse;

public class arrayprgm1 {
    public static void main(String[] args){
        int[] a={50,30,70,20,80};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("the sum of array is "+sum);
    }
}
