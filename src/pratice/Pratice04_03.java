package pratice;

public class Pratice04_03 {
    public static void main(String[] args){
        int[] number=new int[]{10,7,1,5,3,13};
        int max;
        int min;

        max = number[0];
        min = number[0];

        for(int i=0;i<number.length;i++){
            max = Math.max(max,number[i]);
            min = Math.min(min,number[i]);
        }

        System.out.println("가장 큰 수: "+ max +"\n가장 작은 수: "+min);

    }
}
