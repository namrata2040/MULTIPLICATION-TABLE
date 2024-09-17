import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("TABLE");
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        System.out.println("table of "+a+":");
        for(int i=0;i<=10;i++){
            System.out.println(a+"x"+i+"="+(a*i));
           
        }
    }
}
