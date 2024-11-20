package sol.step4;

import java.util.Scanner;

public class ex2884 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt()-45;
        //1번조건 B가 음수일때 -> B는 60을 더해주고 A에서 -1
        //2번 이때 A-1이 음수일때 +24
        if(B<0){
            int H = A-1;
            int M = B+60;
            if(H<0){
                System.out.println(H+24);
                System.out.println(M);
            }else {
                System.out.println(H);
                System.out.println(M);
            }
        }else{
            System.out.println(A);
            System.out.println(B);
        }
    }
}
