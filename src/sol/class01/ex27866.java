package sol.class01;

import java.util.Scanner;

public class ex27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] starr = new char[str.length()];
        int input2 = sc.nextInt();
        sc.close();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            starr[i] =ch;
        }
        System.out.println(starr[input2-1]);


    }
}
