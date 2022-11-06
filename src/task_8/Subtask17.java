package task_8;

import java.util.Scanner;

public class Subtask17 {
    public int recursion() {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int max = N;

        if(N == 0) {
            return max;
        }

        max = Math.max(recursion(), N);

        return max;
    }

    public static void main(String[] args) {
        Subtask17 maxSet = new Subtask17();
        System.out.println(maxSet.recursion());
    }
}
