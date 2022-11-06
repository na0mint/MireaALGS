package task_4.task_4_1;

public class Subtask6 {
    public class Employer {
        private String firstName;
        private String lastName;
        private double income;

        public double getIncome() {
            return income;
        }
    }

    public class Manager extends Employer{
        private double averageSum;

        @Override
        public double getIncome() {
            return super.getIncome() + averageSum*12;
        }
    }
}
