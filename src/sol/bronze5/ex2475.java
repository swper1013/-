package sol.bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class ex2475 {
    public static void main(String[] args)  {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st =new StringTokenizer(br.readLine());
            int count = st.countTokens();
            int[] arr = new int[count];
            for(int i=0;i<count;i++){
                int number = Integer.parseInt(st.nextToken());
                arr[i]=(number*number);
            }
            int num2=0 ;
            for(int num : arr){

                num2+=num;

            }System.out.println(num2%10);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("문제가 발생했습니다.");
        }


    }
}
