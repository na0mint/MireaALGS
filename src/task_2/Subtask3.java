package task_2;

public class Subtask3 {
    public class Tester{
        Circle[] circles = new Circle[] {new Circle(new Point(3, 5), 4),
                new Circle(new Point(0,2), 3)};
        int capacity = circles.length;
    }

    public class Point {
        private double x;
        private double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getY() {
            return y;
        }

        public double getX() {
            return x;
        }
    }

    public class Circle {
        private Point center;
        private double radius;

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public void setCenter(double x, double y) {
            center = new Point(x, y);
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }
    }
}
