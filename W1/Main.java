import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        double num2;
        num2 =  Math.sqrt(num*num+num1*num1);
        System.out.println(num2);
    }
}