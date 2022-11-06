package task_2;

public class Subtask2 {
    public static void main(String[] args) {
        TestBall testBall = new TestBall();
    }

    public static class TestBall {
        Ball ball = new Ball(5, -4);

        {
            System.out.println(ball);
            System.out.println(ball.getX());
            System.out.println(ball.getY());
        }
    }

    public static class Ball {
        private double x = 0.0;
        private double y = 0.0;

        Ball(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Ball() {}

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void move(double xDisp, double yDisp) {
            x += xDisp;
            y += yDisp;
        }

        @Override
        public String toString() {
            return String.format("The ball position is (%f, %f).", x, y);
        }
    }
}
