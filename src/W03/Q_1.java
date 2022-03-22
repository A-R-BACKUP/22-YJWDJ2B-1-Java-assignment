package W03;

/*
i를 900부터 1000까지 설정함
n을 만들어 / 2를 한 값을 출력하게 할 예정
array를 이용해 각 값의 길이를 누적해서 저장..?
어렵다 어려워....
 */

public class Q_1 {
    public static void main(String[] args) {
        for (int i = 900; i <= 1000; i++) {
            int n = i;
            int temp = 0;
            int[] cycles = new int[]{};

            if (n % 2 == 0) {
                int x = 0;
                while (n != 1) {
                    if (n % 2 == 0 && n > 1){
                        temp = (n / 2);
                        cycles[x] = temp;
                        //System.out.println(i + "'s temp" + temp + " ");
                        n = temp;
                    }
                    if (n % 2 != 0 && n > 1) {
                        temp = (n * 3) + 1;
                        cycles[x] = temp;
                        //System.out.println(i + "'s temp" + temp + " ");
                        n = temp;
                    }
                    x++;
                }
            }


            if (n % 2 != 0) {
                int x = 0;
                while (n != 1) {
                    if (n % 2 == 0 && n > 1){
                        temp = (n / 2);
                        cycles[x] = temp;
                        //System.out.println(i + "'s temp" + temp + " ");
                        n = temp;
                    }
                    if (n % 2 != 0 && n > 1) {
                        temp = (n * 3) + 1;
                        cycles[x] = temp;
                        //System.out.println(i + "'s temp" + temp + " ");
                        n = temp;
                    }
                }
            }


        }
        
        //System.out.printf(cycles.length);
    }
}
