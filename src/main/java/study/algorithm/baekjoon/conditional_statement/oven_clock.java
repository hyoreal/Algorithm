package study.algorithm.baekjoon.conditional_statement;

import java.util.Scanner;

/**
 * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
 * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
 * 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
 *
 * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
 *
 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
 * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 *
 * 첫째 줄에는 현재 시각이 나온다.
 * 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
 */

public class oven_clock {
    public static void main(String[] args) {

        // TODO: 현재시각 A시 B분, 필요시간 C분
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 가능 방법 1. A시 B분을 totalMin 분으로 변환 후 totalMin + C = finTotalMin. finTotalMin 를 시와 분으로 변환

        int min = A * 60 + B;
        min += C;

        int hour = (min / 60) % 24;
        min %= 60;

        System.out.print(hour + " " + min);

        /*
        int totalMin = A * 60 + B;
        int finTotalMin = totalMin + C;

        int finHour = (finTotalMin / 60) % 24; // 24보다 클 경우 0부터 시작하도록 % 24
        int finMin = finTotalMin % 60;

        System.out.println(finHour + " " + finMin);
        */

        // 가능 방법 2. C분을 takenHour 시 takenMin 분으로 변환 후 A + takenHour = endHour, B + takenMin = endMin. 만약 endMin 이 60보다 크다면 endHour + 1

        int takenHour = C / 60;
        int takenMin = C % 60;

        int endHour = A + takenHour;
        int endMin = B + takenMin;

        if (endMin >= 60) {
            endMin -= 60;
            endHour += 1;
        }

        System.out.println(endHour % 24 + " " + endMin);
    }
}
