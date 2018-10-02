import java.util.Scanner;

public class kol_vo_delitelei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;

        for (int i = 1; i <= a; ++i) {
            if (a % i == 0) {
                b++;

            }
        }
        System.out.println(b);
    }
}