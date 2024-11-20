package sol.step3;

import java.util.Scanner;

public class ex25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total = sc.nextInt();
        int num = sc.nextInt();
        int tot = 0;
        for (int i = 0; i < num; i++) {
            tot += sc.nextInt() * sc.nextInt();
            System.out.println(tot == Total ? "Yes" : "No");
        }
    }
}
