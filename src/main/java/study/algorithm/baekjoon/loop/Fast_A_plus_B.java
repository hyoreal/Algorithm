package study.algorithm.baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 시간제한 1초
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 *
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 */

public class Fast_A_plus_B {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        /**
         * BufferedWriter는 버퍼를 잡아놓았기때문에
         * 반드시 flush()/close()를 호출하여 뒤처리 필요
         *
         * flush() : 남아있는 데이터 모두 출력
         * close() : 스트림 종료
         */
        bw.close();
    }
}
