package W02;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        long a = 0, b = 1, c;

        System.out.print(a + " " + b + " ");

        for(int i = 2; i <= 10; i++){
            c = a + b;
            System.out.print(c + " "); // 각 항 출력하게 하기.
            a = b;
            b = c;
        }
    }
}
