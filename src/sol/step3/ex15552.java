package sol.step3;

import java.io.*;
import java.util.Scanner;

public class ex15552 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());//줄 전체를 받음
        for(int i=0; i<A; i++){
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);//들어온 값중 띄어쓰기전
            int b = Integer.parseInt(s.split(" ")[1]);//후
            bw.write(a+b+"\n");//엔터마다 끊기
        }
        bw.flush();//화면 출력 실행
    }
}
