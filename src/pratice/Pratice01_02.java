package pratice;

import java.util.Scanner;

public class Pratice01_02 {
    public static void main(String[] args){
        int x;
        int y;
        Scanner sc= new Scanner(System.in);

        x= sc.nextInt();
        y=sc.nextInt();

        System.out.println(Calculator.add(x,y));
        System.out.println(Calculator.sub(x,y));
        System.out.println(Calculator.mul(x,y));
        System.out.println(Calculator.div(x,y));

    }

}
