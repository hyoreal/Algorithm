package study.algorithm.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
 * 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
 * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 *
 * 영수증에 적힌
 * 구매한 각 물건의 가격과 개수
 * 구매한 물건들의 총 금액을 보고,
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 *
 * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
 *
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 *
 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 */

public class Receipt {
    public static void main(String[] args) throws IOException {

        // TODO: 총 금액 X, 구매한 물건 종류 수 N, 각 물건의 가격 a, 개수 b
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum = sum + a * b;
        }

        System.out.print(X == sum ? "Yes" : "No");
    }
}
