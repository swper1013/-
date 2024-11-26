package sol.class01;

import java.util.Scanner;

public class ex2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//테스트 케이스

        for(int k=0;k<T;k++){
            int R = sc.nextInt();//반복횟수
            String S1 = sc.next();//문자열
            String total="";
            for(int i=0;i<S1.length();i++){
                char one = S1.charAt(i);
                for(int j=0;j<R;j++){
                    total+=one;
                }
            }
            System.out.println(total);
        }sc.close();

    }
}
