package pratice;

import java.util.Scanner;

public class Pratice02_01 {
    public static void main(String[] args){
        double x;
        double y;
        boolean checkZeroY=false;
        Scanner sc= new Scanner(System.in);

        x= sc.nextInt();
        y=sc.nextInt();

        if(y==0)
            checkZeroY=true;

        System.out.println(Calculator.add(x,y));
        System.out.println(Calculator.sub(x,y));
        System.out.println(Calculator.mul(x,y));
        if (checkZeroY) {
            System.out.println("0으로는 나눌수 없습니다.");
        }else {
            System.out.println(Calculator.div(x, y));
        }
    }
}
