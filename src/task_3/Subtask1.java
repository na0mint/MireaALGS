package task_3;

public class Subtask1 {
    public static void main(String[] args) {
        int a = 120;
        Double b = Double.valueOf(a);

        String s = "1245.34";
        Double c = Double.parseDouble(s);

        System.out.println(b);
        System.out.println(c);

        Double w = 123.556;
        int y = w.intValue();
        double x = w.doubleValue();
        String dob = Double.toString(x);

        System.out.println(y);
        System.out.println(x);
        System.out.println(dob);
    }
}
