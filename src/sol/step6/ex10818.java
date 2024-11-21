package sol.step6;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ex10818 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        System.out.println(num[0]+" "+num[N-1]);
    }
}
