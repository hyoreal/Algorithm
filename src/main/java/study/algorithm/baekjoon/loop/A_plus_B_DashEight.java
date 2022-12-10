package study.algorithm.baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */

public class A_plus_B_DashEight {
    public static void main(String[] args) throws IOException {
        // TODO: 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력. x는 1부터 시작, C는 A+B.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + sum + "\n");
        }
        bw.close();
    }
}
