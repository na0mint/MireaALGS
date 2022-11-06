package task_6;

public class Subtask1 {
    public interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    public static class MovablePoint implements Movable{
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint() {
        }

        public String toString() {
            return String.format("x: %d\ny: %d\nxSpeed: %d\nySpeed: %d\n", x, y, xSpeed, ySpeed);
        }

        @Override
        public void moveUp() {
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }
    }

    public class MovableCircle implements Movable{
        private int radius;
        private MovablePoint center;

        MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        @Override
        public String toString() {
            return String.format("radius: %d\n", radius) + super.toString();
        }

        @Override
        public void moveUp() {
            center.moveUp();
        }

        @Override
        public void moveDown() {
            center.moveDown();
        }

        @Override
        public void moveLeft() {
            center.moveLeft();
        }

        @Override
        public void moveRight() {
            center.moveRight();
        }
    }
}
