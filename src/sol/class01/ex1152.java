package sol.class01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st= new StringTokenizer(str," ");
        System.out.println(st.countTokens());

    }
}
