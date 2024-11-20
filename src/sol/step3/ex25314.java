package sol.step3;

import java.util.Scanner;

public class ex25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = A/4;
        StringBuilder result = new StringBuilder();
        //나머지가 0이 될때까지 4로 나누고 +int 나눈 값은long
        for(int i=0;i<B;i++){
            result.append("long ");
        }
        System.out.println(result+"int");
    }
}
