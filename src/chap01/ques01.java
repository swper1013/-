package chap01;
import java.util.Scanner;
public class ques01 {
    public static void main(String[] args){
      /*Scanner stdIn = new Scanner(System.in);
        System.out.println("정수 최대값 구하기");
        System.out.println("a : "); int a = stdIn.nextInt();
        System.out.println("b : "); int b = stdIn.nextInt();
        System.out.println("c : "); int c = stdIn.nextInt();

        int max = a;
        if (b>max) max =b;
        if (c>max) max =c;

        System.out.println("최대값은"+max);
        */
        Scanner midIn = new Scanner(System.in);
        System.out.println("중간값 구하기");
        System.out.println("a : "); int a = midIn.nextInt();
        System.out.println("b : "); int b= midIn.nextInt();
        System.out.println("c : "); int c = midIn.nextInt();
        if(a>=b){
            if(b<=c){
                int mid = b;

                System.out.println("중간값은 "+mid);
            }
        }else {
            //a<=b
            if (a<=c){
                int mid = a;
                System.out.println("중간값은"+mid);
            }
        }


    }

}
