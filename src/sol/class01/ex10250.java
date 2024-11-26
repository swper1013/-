package sol.class01;

import java.util.Scanner;

public class ex10250
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//테스트 횟수

        for(int i=0;i<T;i++){
            int H = sc.nextInt();//높이
            int W = sc.nextInt();//넓이
            int N = sc.nextInt();//번쨰 손님
            int fn =0;
            int ru =0;
            if(N%H==0){
                fn =H;
                ru = N/H;
            }else {
                fn=N%H;
                ru = N/H+1;
            }
            System.out.println(fn*100+ru);
        }
    }
}
