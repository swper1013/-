package sol.bronze5;

import java.io.*;

public class ex2741 {
    public static void main(String[] args)  {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int A = Integer.parseInt(br.readLine());
            for(int i=0;i<A;i++){
                System.out.println(i+1);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("문제가 발생했습니다.");
        }


    }
}
