package sol.bronze5;

import java.util.Scanner;

public class ex4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String je = sc.next();
        String doc = sc.next();
        int jenum = je.length();
        int docnum = doc.length();
        if(jenum>=docnum){
            System.out.println("go");
        }else{
            System.out.println("no");
        }

    }
}
