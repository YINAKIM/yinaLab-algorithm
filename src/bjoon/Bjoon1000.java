package bjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Q1000. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    https://www.acmicpc.net/problem/1000

    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    첫째 줄에 A+B를 출력한다.
*/
public class Bjoon1000 {
    public static void main(String[] args) {

        // 1.BufferedReader이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] arr = br.readLine().split(" "); // 공백하나 넣고 입력
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("=============================");


        // 2. System.in.read이용
        try {
            int a = System.in.read() - 48; // read()는 아스키코드로 반환하기때문에 아스키코드 48(숫자0)을 빼야됨
            int b = System.in.read() - 48;
            System.out.println(a+b);
        }catch (Exception e){
            e.printStackTrace();
        }



        /*
        InputStream inputStream = System.in;
        int a = inputStream.read(); //throws IOException
        System.out.println(a);
        4 -> 52
        5 -> 53
        6 -> 54
        내가 입력한 값은 read()가 읽어서 반환타입인 정수형 변수에 담긴다

        int형으로 저장되는데 인코딩방식에따라 10진수로 변수에 저장된다.
        그런데 print할 때는 1byte만 읽는다.

        1. UTF-8로 입력을 받는다
        2. read()는 1byte만 읽기때문에 나머지byte는 스트림에 잔존하게된다.
        3. 읽어들인 byte값은 메모리에 UTF-16에 대응되는 문자의 인코딩방식으로 2진수 값이 저장된다
        4. 출력시 메모리에 저장되어있던 2진수값에 대응되는 문자가 UTF-8로 변환되어 출력된다.
        */



    }
}
