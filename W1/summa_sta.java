import java.util.Scanner;

public class summa_sta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 0;

        for (int i = 1; i <= 100; ++i) {
            int x = scanner.nextInt();
                       b+=x;
        }
        System.out.println(b);
        }

    }
