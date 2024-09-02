import java.util.Scanner;
public class Multipliestwonum  {
    public static void main(String []args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = myobj.nextInt();
        int b = myobj.nextInt();
        int sum = a*b ;
        System.out.println(sum);
    }
}