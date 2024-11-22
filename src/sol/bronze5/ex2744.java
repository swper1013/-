package sol.bronze5;

import java.io.*;

public class ex2744 {
    public static void main(String[] args)  {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String A = br.readLine();
            for(int i=0;i<A.length();i++){
                char B = A.charAt(i);
                if(Character.isUpperCase(B)){
                    System.out.print(Character.toLowerCase(B));
                }else{
                    System.out.print(Character.toUpperCase(B));
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("문제가 발생했습니다.");
        }


    }
}
