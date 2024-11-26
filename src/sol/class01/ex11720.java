package sol.class01;

import java.util.Scanner;

public class ex11720 {
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
            sum+=Character.getNumericValue(arr[i]);

        }
        System.out.println(sum);

    }
}
