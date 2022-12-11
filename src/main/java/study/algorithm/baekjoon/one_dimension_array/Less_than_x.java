package study.algorithm.baekjoon.one_dimension_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 *
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
 * 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 */

public class Less_than_x {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder str = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (a < X) {
                str.append(a).append(" ");
            }
        }
        bw.write(str.toString().trim());
        bw.close();
    }
}
