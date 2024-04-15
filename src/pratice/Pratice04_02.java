package pratice;

import java.util.Scanner;

public class Pratice04_02 {
    public static void main(String[] args) {
        int[] studentNum = new int[5];
        int sum=0;
        int avg;

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            studentNum[i]=sc.nextInt();
            sum+=studentNum[i];
        }
        avg=sum/5;

        System.out.println("학생들의 평균 점수는: "+avg);

    }
}
