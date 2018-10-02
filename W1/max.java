import java.util.Scanner;

public class max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        if(num>num1){
            System.out.println(num);
        }
        else{
            System.out.println(num1);
        }
    }
}