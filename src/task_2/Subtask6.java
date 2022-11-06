package task_2;

public class Subtask6 {
    public class Circle {
        private double radius;

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setDiameter(double diameter) {
            radius = diameter/2;
        }

        public double getDiameter() {
            return radius*2;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI*radius*radius;
        }

        public double getPerimeter() {
            return 2*Math.PI*radius;
        }

        public boolean isBigger(Circle circle) {
            return this.getRadius() > circle.getRadius();
        }
    }
}
