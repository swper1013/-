package sol.class02;

import java.io.IOException;
import java.util.Scanner;

public class ex2231 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int total = 0;
        for(int i=0;i<A;i++){
            int number = i;
            int sum =0;
            while (number !=0){
                sum +=number%10;
                number /=10;
            }
            if(sum+i==A){
                total=i;
                break;
            }
        }
        System.out.println(total);


    }
}
