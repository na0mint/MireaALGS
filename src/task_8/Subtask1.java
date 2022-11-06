package task_8;

public class Subtask1 {
    int n = 1;
    public void recursion(int N) {
        if(N == 0) {
            return ;
        }

        for(int i = 0; i < n; i++) {
            System.out.println(n);
        }

        n++;

        recursion(N - 1);
    }

    public static void main(String[] args) {
        Subtask1 rec = new Subtask1();
        rec.recursion(5);
    }
}
