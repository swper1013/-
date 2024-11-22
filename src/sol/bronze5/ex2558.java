package sol.bronze5;

import java.io.*;

public class ex2558 {
    public static void main(String[] args)  {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            System.out.println(A+B);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("문제가 발생했습니다.");
        }


    }

}
