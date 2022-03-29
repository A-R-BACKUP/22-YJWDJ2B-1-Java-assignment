package W04;

/*
2의 100 제곱 값을 출력하는 프로그램 작성
조건) 정수 배열 이용

정말 뭐하라는 문제인건가요....???????
long의 범위를 이미 훨씬 뛰어 넘는데;;;;;;
 */

public class Q_7 {
    public static void main(String[] args) {
        long[] arr = new long[100];
        long result = 2;
        int i = 0;
        for (i = 0; i < 99; i++) {
            arr[i] = result;
            System.out.print(arr[i] + " ");
            result *= 2;

        }
    }
}
