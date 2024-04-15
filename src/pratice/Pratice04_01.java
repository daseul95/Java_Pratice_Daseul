package pratice;
/*
10개의 정수 값을 저장할 수 있는 배열을 생성하고,
1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
 */
public class Pratice04_01 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for(int i =0;i<10;i++){
            num[i]=i+1;
        }

        for(int i=0;i<10;i++){
            System.out.printf(num[i]+" ");
        }
    }
}
