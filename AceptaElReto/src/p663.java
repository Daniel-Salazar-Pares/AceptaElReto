
import java.util.Scanner;


public class p663 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        while (c > 0) {
            int a = s.nextInt();
            if (a > 0) {
                System.out.println(a-1);
            } else {
                System.out.println(a);
            }
            c--;
        }
    }
}
