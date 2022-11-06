package task_1;

import java.util.Scanner;

public class Subtask4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }

        int max = array[0], min = array[0];

        for(int num : array) {
            System.out.println(num);

            if(max < num) {
                max = num;
            }

            if(min > num) {
                min = num;
            }
        }

        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}
