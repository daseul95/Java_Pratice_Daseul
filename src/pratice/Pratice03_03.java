package pratice;

import java.util.Scanner;

//사용자로부터 숫자 n을 입력받아,
// 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.

public class Pratice03_03 {
    public static void main(String[] args) {
        int num;
        int sum;

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sum = (num*(num+1))/2;

        System.out.println("1부터 "+ num +"까지의 합은 : " +sum+"입니다.");



    }
}
