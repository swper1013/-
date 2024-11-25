package sol;
import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String input2 = sc.next();
        char[] arr  = new char[input2.length()];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            char ch = input2.charAt(i);
            arr[i] = ch;
        }
        for(int i=0;i<arr.length;i++){

            sum+=Character.getNumericValue(i);
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}

