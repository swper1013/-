package sol.bronze5;

import java.util.Scanner;

public class ex5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }
        System.out.println(total);
    }
}
