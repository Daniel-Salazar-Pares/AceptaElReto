import java.util.Scanner;

public class p362 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        while (casos > 0) {
            int dia = scan.nextInt();
            int mes = scan.nextInt();
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            casos--;
        }
    }
}