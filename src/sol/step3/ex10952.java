package sol.step3;

import java.io.IOException;
import java.util.Scanner;

public class ex10952 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}
