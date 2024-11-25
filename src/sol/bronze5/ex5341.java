package sol.bronze5;

import java.util.Scanner;

public class ex5341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int N = sc.nextInt();
            int sum=0;
            if(N==0){
                break;
            }
            for(int i=1;i<N+1;i++){
                sum+=i;

            }
            System.out.println(sum);
        }
    }
}
