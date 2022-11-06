package task_1;

public class Subtask3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 6, 45, 6, 7, 67};
        int sum = 0;

        for(int num : array) {
            sum += num;
            System.out.println(num);
        }

        System.out.println(sum);
        System.out.println(sum / array.length);
    }
}

