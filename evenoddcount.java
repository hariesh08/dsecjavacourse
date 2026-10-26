package dsecjavacourse;

public class evenoddcount {
    public static void main(String[] args){
        int[] a={10,15,20,25,30,35};
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("the number of even numbers is "+even);
        System.out.println("the number of odd numbers is "+odd);
    }
}
