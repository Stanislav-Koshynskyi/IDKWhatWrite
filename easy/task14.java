import java.util.Scanner;

public class task14 {
    public static void main(String args[]) {
        int n;
        int m;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i%2!=0 && j%2!=0) {
                    System.out.print("#");
                }
                else if (i%2==0 && j%2==0) {
                    System.out.print("#");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println("\n");
        }
    }
}
