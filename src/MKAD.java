import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int t = scan.nextInt();
        int s = 109;

        if (v > 0) {
            int x = v * t;
            System.out.println((x - s) + 1);
        } else {
            int y = v * t;
            System.out.println((s + y) + 1);
        }
    }
}
