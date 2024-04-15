package pratice;

import java.util.Scanner;

public class Pratice02_02 {
    public static void main(String[] args){
        int x,y,z;
        int max;
        int min;

        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        max=Math.max(x,y);
        max=Math.max(max,z);

        min=Math.min(x,y);
        min=Math.min(min,z);

        System.out.println("가장 큰 수: "+ max +"\n가장 작은 수: "+min);

    }
}
