import java.util.Scanner;

public class visokosnyi_god {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 4 == 0 & x % 100 != 0 || x % 400 == 0) {

            System.out.println("YES");
        } else {

            System.out.println("NO");
        }
    }
}