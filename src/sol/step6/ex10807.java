package sol.step6;

import java.io.IOException;
import java.util.Scanner;

public class ex10807 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int size = num.length;
        int i=0;
        int count=0;
        for(i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        for (i=0;i<size;i++){
            if(num[i]==V){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
