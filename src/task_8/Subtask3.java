package task_8;

public class Subtask3 {
    int B = 5;
    public void recursion(int A) {
        if(A == B) {
            System.out.println(B);
            return ;
        }

        if(A < B) {
            System.out.println(A);
            recursion(A+1);
        } else {
            System.out.println(B);
            B++;
            recursion(A);
        }
    }

    public static void main(String[] args) {
        Subtask3 o = new Subtask3();
        o.recursion(0);
    }
}
