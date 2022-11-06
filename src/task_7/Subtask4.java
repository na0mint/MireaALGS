package task_7;

public class Subtask4 {
    public interface MathCalculable{
        double PI = 3.1415926;

        double pow(double num, int power);
        double mod(double x, double y);
    }

    public class MathFunc implements MathCalculable{
        @Override
        public double pow(double num, int power) {
            double result = 1;

            for(int i = 0; i < power; i++) {
                result = result * num;
            }

            return result;
        }

        @Override
        public double mod(double x, double y) {
            return Math.sqrt(pow(x, 2) + pow(y, 2));
        }

        public double circleLength(double radius) {
            return 2 * PI * radius;
        }
    }
}
