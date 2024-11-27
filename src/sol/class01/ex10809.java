package sol.class01;

import java.util.Scanner;

public class ex10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char go = 'a';
        for(int i=0;i<26;i++){
            System.out.print(str.indexOf((char)(go+i))+" ");
        }
    }
}
