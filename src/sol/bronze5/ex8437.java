package sol.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class ex8437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger  k = sc.nextBigInteger();
        BigInteger two = BigInteger.TWO;
        BigInteger kl = n.add(k).divide(two);
        BigInteger nata = n.subtract(k).divide(two);
        System.out.println(kl);
        System.out.println(nata);


    }
}
