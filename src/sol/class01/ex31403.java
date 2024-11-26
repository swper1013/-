package sol.class01;

import java.util.Scanner;

public class ex31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A+B-C);
        String AS = Integer.toString(A);
        String BS = Integer.toString(B);
        String s ="";
        s+=AS;
        s+=BS;
        int si = Integer.parseInt(s);
        System.out.println(si-C);


    }
}
