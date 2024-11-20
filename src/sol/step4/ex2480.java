package sol.step4;

import java.util.Scanner;

public class ex2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if((A==B)&&(B==C)){
            System.out.println(10000+A*1000);
        }else if((A==B)||(B==C)||(A==C)){
            int two = (A==B)? A:C;
            System.out.println(1000+two*100);
        }else {
            int one = ((A>B)?A:B);
            int one2 = (C>one ? C: one);

            System.out.println(one2*100);
        }
    }
}
