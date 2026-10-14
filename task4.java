package dsecjavacourse;
import java.util.Scanner;

public class task4 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        Boolean membership=true;
        System.out.print("Enter purchase amount:");
        Double pcam=a.nextDouble();
        if(membership==true || pcam>=2000){
            System.out.println("ELIGIBLE FOR 20% DISCOUNT");
        }
        else{
            System.out.println("NOT ELIGIBLE FOR DISCOUNT");
        }
        a.close();
    }
    
}
