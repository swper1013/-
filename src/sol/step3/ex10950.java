package sol.step3;

import java.util.Scanner;

public class ex10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] =new int[A];
        for(int i=0;i<A;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i]=a+b;
        }
        for(int k :arr){
            System.out.println(k);
        }

    }
}
