package dsecjavacourse;
import java.util.Scanner;
public class task2 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int b=a.nextInt();
        if(b%2==0 && b<10){
            System.out.printf("%d is even number and less than 10",b);
        }
        else{
            if(b%2==0){
                System.out.printf("%d is even but not less than 10",b);
            }
            else{
                System.out.printf("%d is odd but it is less than 10",b);
            }
        }
        a.close();
    }
}
