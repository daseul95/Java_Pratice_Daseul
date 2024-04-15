package pratice;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Pratice01_03 {
    public static void main(String[] args) throws IOException {
        String name;
        boolean checkName=true;
        int intName;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        name = sc.nextLine();

        for(int i =0;i<name.length();i++) {
            intName = name.codePointAt(i);
            if(!(intName>=65&&intName<=122)){
                checkName=false;
            }
        }

        System.out.print("나이를 입력해주세요 : ");
        age = sc.nextInt();


        if(checkName){
        System.out.println("이름 : " + name + "\n나이 : " + age);
    }else{
            System.out.println("이름에 숫자를 넣지 말아주세요.");
        }
    }

}


