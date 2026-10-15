package dsecjavacourse;
import java.util.Scanner;
public class task6 {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("ENTER WITHDRAWEL AMOUNT :");
        int withdraw=a.nextInt();
        System.out.print("\nENTER BALANCE :");
        int balance=a.nextInt();
        if(withdraw<balance){
            if(withdraw>0 && withdraw%100==0){
                balance=balance-withdraw-2;
                System.out.printf("TRANSACTION OF %d IS SUCCESSFULL \n",withdraw);
                System.out.println("REMAINING BALANCE IS "+balance);
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }
        else{
            System.out.println("INSUFFICIENT BALANCE");
        }
        a.close();
    }
  
}
