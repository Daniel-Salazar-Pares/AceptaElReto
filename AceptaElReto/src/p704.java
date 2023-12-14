import java.util.Arrays;
import java.util.Scanner;

public class p704 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        while (casos > 0) {
            int height = scan.nextInt();
            int with = scan.nextInt();
            int numColors = scan.nextInt();
            Integer[] colors = new Integer[numColors];
            for (int color = 0; color < numColors; color++) {
                colors[color] = scan.nextInt();
            }
            Arrays.sort(colors);
            if (numColors < 2) {
                System.out.println("NO");
            } else {
                if (with > height) {
                    if (colors[numColors - 1] >= with * 2 && colors[numColors - 2] >= height * 2) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (colors[numColors - 1] >= height * 2 && colors[numColors - 2] >= with * 2) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
            casos--;
        }
    }
}