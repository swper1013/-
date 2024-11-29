package sol.class02;

import java.io.IOException;
import java.util.Scanner;

public class ex1978 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0;i<N;i++){
            boolean prime = true;
            int num = sc.nextInt();
            if(num==1){
                continue;
            }
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
            }
        }
        System.out.println(count);

    }
}
