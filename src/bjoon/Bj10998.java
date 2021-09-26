package bjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj10998 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] arr = bf.readLine().split(" ");
            System.out.println(Integer.parseInt(arr[0])*Integer.parseInt(arr[1]));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
    Q10998. 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
    https://www.acmicpc.net/problem/10998

    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    첫째 줄에 A×B를 출력한다.
*/
