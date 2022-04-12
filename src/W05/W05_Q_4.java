package W05;

import java.util.Scanner;

public class W05_Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        int month;
        System.out.print("년 월 입력: ");//년월을 입력받아 달력출력
        year=sc.nextInt();
        month=sc.nextInt();
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        calender(year,month);
    }

    static void calender(int y,int m) {
        int A_day=0;
        int cnt=0;//출력달 카운터
        int sector;//특별 앞 지정자
        A_day = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
	/*for(int i=1;i<y;i++) {
		if(IsLeap(i)) {
			A_day+=366;
		}
		else
			A_day+=365;
	}입력년도 전년도 까지의 총일자.*/
        switch(m) {
            case 12:
                A_day+=30;//11월을 다 더했다.
            case 11:
                A_day+=31;//10월을 다 더했다
            case 10:
                A_day+=30;//9월을 다 더했다
            case 9:
                A_day+=31;//8월을 다 더했다
            case 8:
                A_day+=31;//7월을 다 더했다
            case 7:
                A_day+=30;//6월을 다 더했다
            case 6:
                A_day+=31;//5월을 다 더했다
            case 5:
                A_day+=30;//4월을 더했다.
            case 4:
                A_day+=31;//3월을 더했다
            case 3:
                if(IsLeap(y))
                    A_day+=29;//2월 윤년을 통째로 더했다
                else
                    A_day+=28;//2월을 통재로 더했다
            case 2:
                A_day+=31;//1월을 통째로 더했다
            default:
                break;
        }//달출력
        /*---------이 위까지가 이전달까지 총 날자의 개수-----------------------*/

        sector=(A_day+1)%7;//시작 특수 구별자 시작 시 날짜에 따른 구별자를 위한 특수자이다.

        if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)) {cnt+=31;}
        else if((m==4)||(m==6)||(m==9)||(m==11)) {cnt+=30;}
        else if((IsLeap(y))&&(m==2)) {cnt+=29;}
        else if(m==2){cnt+=28;}

        switch(sector) {
            case 0://달의 첫번째 요일이 월요일
                System.out.print("");
                break;
            case 1://달의 첫번째 요일이 화요일
                System.out.print(" \t");
                break;
            case 2://달의 첫번재 요일이 수요일
                System.out.print(" \t\t");
                break;
            case 3://달의 첫번째 요일이 목요일
                System.out.print(" \t\t\t");
                break;
            case 4://달의 첫번째 요일이 금요일
                System.out.print(" \t\t\t\t");
                break;
            case 5://달의 첫번째 요일이 토요일
                System.out.print(" \t\t\t\t\t");
                break;
            case 6:
                System.out.print(" \t\t\t\t\t\t");
                break;
        }
        for(int i=1;i<=cnt;i++) {
            A_day++;
            System.out.printf("%d\t", i);
            if(A_day%7==6)
                System.out.println("");
        }
    }//달력 출력 연산자1 총 날짜를 그림 함수로 넘겨준다.


    static boolean IsLeap(int y) {
        if((y%4==0)&&(y%100!=0)&&(y%400==0))
            return true;
        return false;
    }
}
