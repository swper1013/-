package sol.bronze5;

import java.util.Scanner;

public class ex3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] che={1,1,2,2,2,8};
        int[] input = new int[che.length];
        for(int i=0;i<che.length;i++){
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(che[i]-input[i] + " "); }

    }
}
