package study.algorithm.baekjoon.one_dimension_array;

import java.io.*;
import java.util.StringTokenizer;

/**
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 */

public class Min_Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//        // 조건문을 활용한 풀이
//        int max = Integer.parseInt(st.nextToken());
//        int min = max;
//
//        while (st.hasMoreTokens()) {
//            int num = Integer.parseInt(st.nextToken());
//            if (max < num) max = num;
//            else if (min > num) min = num;
//        }
//
//        bw.write(min + " " + max);
//        bw.close();

        // 배열 + Math.max / Math.min 사용한 풀이
        int[] arr = new int[N];
        int idx = 0;

        do {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        } while (idx < N);

        int min = arr[0], max = arr[0];

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        bw.write(min + " " + max);
        bw.close();
    }
}
