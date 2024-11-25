package sol.bronze5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex6840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(A);
        arr.add(B);
        arr.add(C);
        Collections.sort(arr);//정렬
        System.out.println(arr.get(1));
    }
}
