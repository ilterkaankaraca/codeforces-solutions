import java.util.Scanner;

public class A_270 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if(360%(180-Integer.parseInt(scanner.next()))!=0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}