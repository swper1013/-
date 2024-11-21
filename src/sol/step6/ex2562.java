package sol.step6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2562 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        sc.close();
        int count = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int value : list){
            count ++;
            if(value>max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }

}
