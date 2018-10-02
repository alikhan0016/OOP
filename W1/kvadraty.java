import java.util.Scanner;

public class kvadraty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        for (int i = a; i <= b; ++i) {
            if(Math.sqrt(i) == (int)(Math.sqrt(i))){
                System.out.println(i);
            }
        }
    }
}