package pratice;

//1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.

public class Pratice03_02 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            //짝수를 출력
            if(i%2==0){
                System.out.print(i);
                System.out.print(" ");
            }
            //보기 좋게 50개 단위로 나누어서 출력하기
            if(i%50==0){
                System.out.print("\n");
            }
        }
    }
}
