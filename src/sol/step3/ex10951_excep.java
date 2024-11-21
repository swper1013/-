package sol.step3;

import java.io.IOException;
import java.util.Scanner;

public class ex10951_excep {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int a  = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
