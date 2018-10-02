import java.util.Scanner;

public class summa_chisel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 0;

        for (int i = 1; i <= n; ++i) {
            int x = scanner.nextInt();
            b+=x;
        }
        System.out.println(b);
    }

}
