package study.algorithm.baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */

public class A_plus_B_DashFour {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String exist = "";

        while ((exist = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(exist);
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
