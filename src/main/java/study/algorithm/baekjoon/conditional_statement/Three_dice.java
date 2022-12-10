package study.algorithm.baekjoon.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 *
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
 * 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
 * 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 *
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 *
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 */

public class Three_dice {
    public static void main(String[] args) throws IOException {

        // TODO: 첫번째 주사위의 눈 fst, 두번째 주사위의 눈 snd, 세번째 주사위의 눈 trd
//
//        Scanner sc = new Scanner(System.in);
//
//        int fst = sc.nextInt();
//        int snd = sc.nextInt();
//        int trd = sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fst = Integer.parseInt(st.nextToken());
        int snd = Integer.parseInt(st.nextToken());
        int trd = Integer.parseInt(st.nextToken());

        // 모든 입력이 다른 경우
        if (fst != snd && snd != trd && trd != fst) {

            int max = Math.max(fst, Math.max(snd, trd));
            System.out.println(max * 100);
        }
        // 모든 입력이 같을 경우
        else if (fst == snd && snd == trd) {

            System.out.println(10000 + fst * 1000);
        }
        // 두개의 입력만 같을 경우
        else if (fst == snd || fst == trd) {

            System.out.println(1000 + fst * 100);
        } else {

            System.out.println(1000 + snd * 100);
        }
    }
}
