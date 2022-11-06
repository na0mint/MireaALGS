package task_4.task_4_1;

public class Subtask7 {
    public static class TestPupil {
        public static void main(String[] args) {
            Pupil student1 = new Student();
            Pupil student2 = new Student();
            Pupil schoolBoy1 = new SchoolBoy();
            Pupil schoolBoy2 = new SchoolBoy();

            Pupil[] array = new Pupil[] {student1, schoolBoy1, schoolBoy2, student2};

            for(Pupil pupil : array) {
                if(Student.class == pupil.getClass()) {
                    System.out.println(pupil);
                }
            }

            System.out.println();

            for(Pupil pupil : array) {
                if(SchoolBoy.class == pupil.getClass()) {
                    System.out.println(pupil);
                }
            }
        }
    }
    public static class Pupil {
    }

    public static class SchoolBoy extends Pupil{
        @Override
        public String toString() {
            return "Школьник";
        }
    }

    public static class Student extends Pupil{
        @Override
        public String toString() {
            return "Студент";
        }
    }
}
