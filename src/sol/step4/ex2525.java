package sol.step4;

import java.util.Scanner;

public class ex2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int M = B+C;
        if(M>=60){
            if(A+(M/60)>=24){
                //48+25 = 73
                //73/60 = 1
                int H = A+M/60;
                System.out.println(H-24);
                System.out.println(M%60);
            }else {
                System.out.println(A+(M/60));
                System.out.println(M%60);
            }

        }else {
            System.out.println(A);
            System.out.println(M);}


    }
}
