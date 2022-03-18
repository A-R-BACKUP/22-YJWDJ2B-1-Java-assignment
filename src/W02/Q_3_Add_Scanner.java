package W02;

import java.util.Scanner;

public class Q_3_Add_Scanner {
    public static void main(String[] args) {
        long a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 번쨰 항까지 출력?: ");
        int term = sc.nextInt();
        if (term > 0 && term <= 2) {
            System.out.print(a + " " + b + " ");
        } else if (term > 0 && term >= 2) {
            System.out.print(a + " " + b + " ");
            for(int i = 2; i <= 10; i++){
                c = a + b;
                System.out.print(c + " "); // 각 항 출력하게 하기.
                a = b;
                b = c;
            }
        } else {
            System.out.println("error");
        }




    }
}
