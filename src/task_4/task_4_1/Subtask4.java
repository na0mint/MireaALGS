package task_4.task_4_1;

public class Subtask4 {
    public class Matrix {
        private final int lines = 3;
        private final int columns = 3;
        private double[][] matrix = new double[lines][columns];

        public Matrix() {
            for(double[] numArr : matrix) {
                for(double num : numArr ) {
                    num = Math.random() * 50 + 1;
                }
            }
        }

        public Matrix sum(Matrix matrix) {
            Matrix result = new Matrix();
            for(int line = 0; line < lines; line++) {
                for(int column = 0; column < columns; column++) {
                    result.matrix[line][column] = matrix.matrix[line][column] + this.matrix[line][column];
                }
            }

            return result;
        }

        public Matrix multiplyByNumber(double number) {
            for(double[] numArr : matrix) {
                for(double num : numArr) {
                    num = num * number;
                }
            }

            return this;
        }

        public void print() {
            for(int line = 0; line < lines; line++) {
                for(int column = 0; column < columns; column++) {
                    System.out.print(matrix[line][column] + "  ");
                }
                System.out.println();
            }
        }

        public Matrix multiply(Matrix matrix) {
            Matrix result = new Matrix();

            for(int line = 0; line < lines; line++) {
                for(int column = 0; column < columns; column++) {
                    for(int inner = 0; inner < columns; inner++) {
                        result.matrix[line][column] += this.matrix[line][inner] * matrix.matrix[inner][column];
                    }
                }
            }

            return result;
        }
    }
}
