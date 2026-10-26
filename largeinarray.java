package dsecjavacourse;

public class largeinarray {
    public static void main(String[] args){
        int[] a={50,30,70,20,80};
        int large=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
            else{
                large=large;
            }
        }
        System.out.println("the large ele in array is "+large);

    }
}
