package W1;
import java.util.Scanner;

public class hack_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, x);
        }
        System.out.println("================================");

    }
}
