package dsecjavacourse;
import java.util.Scanner;

public class task3 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        double marks=55;
        double attendance=78.5;
        if(marks>=40 && attendance >= 75){
            System.out.print("PASS");
        }
        else{
            System.out.print("FAIL");
        }
        a.close();
    }
}
