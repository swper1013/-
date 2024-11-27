package sol.class02;

import java.util.Arrays;
import java.util.Scanner;

public class ex4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A==0&&B==0&&C==0){
                sc.close();
                break;
            }
            int[] tri ={A,B,C};
            Arrays.sort(tri);
            A = tri[0];
            B = tri[1];
            C = tri[2];
            if((A*A)+(B*B)==(C*C)){
                System.out.println("right");
            }
            else
                System.out.println("wrong");
        }
    }
}
