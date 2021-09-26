package bjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj1008 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] arr = bf.readLine().split(" ");
            System.out.println(Double.parseDouble(arr[0])/Double.parseDouble(arr[1]));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
    Q1008. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
    https://www.acmicpc.net/problem/1008

    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10* 이하이면 정답이다.

    ex) 입력     출력 (10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.)
        1 3     0.33333333333333333333333333333333
        4 5     0.8
*/
