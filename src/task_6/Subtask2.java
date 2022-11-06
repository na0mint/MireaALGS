package task_6;

import task_6.Subtask1.*;

public class Subtask2 {
    public class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        public String toString() {
            return String.format("Top left point: %s\nBottom right point: %s", topLeft.toString(), bottomRight.toString());
        }

        @Override
        public void moveUp() {
            topLeft.moveUp();
            bottomRight.moveUp();
        }

        @Override
        public void moveDown() {
            topLeft.moveDown();
            bottomRight.moveUp();
        }

        @Override
        public void moveLeft() {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }

        @Override
        public void moveRight() {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
