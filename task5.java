package dsecjavacourse;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("ENTER PASSWORD :");
        String pass=a.nextLine();
        if(pass.length()>=8){
            System.out.print("PASSWORD ACCEPTED");
        }
        else{
            System.out.print("PASSWORD NOT ACCEPTED");
            System.out.println("PASSWORD LENGTH SHOULD BE ATLEAST 8 CHARACTERS");
        }
        a.close();
    }
    
}
