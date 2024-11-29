package sol.class02;

import java.util.Scanner;

public class ex30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//참가자수

        int[] size = new int[6];
        for (int i = 0; i < size.length; i++) {
            size[i] = sc.nextInt();
        }
        int shirt = sc.nextInt();//셔츠 최소묶음
        int pen = sc.nextInt();//펜 최소묶음
        int count = 0;
        for (int i = 0; i < size.length; i++) {
            count += size[i] / shirt;
            if (size[i] % shirt != 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.print(N / pen + " " + N % pen);


    }}
