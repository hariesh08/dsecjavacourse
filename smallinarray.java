package dsecjavacourse;

public class smallinarray {
    public static void main(String[] args){
        int[] a={50,30,70,20,80};
        int small=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<small){
                small=a[i];
            }
            else{
                small=small;
            }
        }
        System.out.println("the small ele in array is "+small);
    }
}
