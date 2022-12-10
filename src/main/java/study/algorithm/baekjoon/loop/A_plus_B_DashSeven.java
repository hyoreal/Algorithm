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

public class A_plus_B_DashSeven {
    public static void main(String[] args) throws IOException {

        // TODO: 테스트 케이스마다 "Case #x: " 출력 후, A+B를 출력. 테스트 케이스 번호는 1부터 시작.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i +": " + sum + "\n");
        }
        bw.close();
    }
}
