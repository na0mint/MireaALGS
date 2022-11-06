package task_2;

import java.util.ArrayList;
import java.util.List;

public class Subtask5 {
    public class Dog{
        private String name;
        private int age;

        Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int toHumanAge() {
            return age*7;
        }

        @Override
        public String toString() {
            return String.format("Name: %s\nAge: %d\n", name, age);
        }
    }

    public class ПитомникСобак {
        List<Dog> dogs = new ArrayList<>();

        public void add(Dog... dogsArray) {
            dogs.addAll(List.of(dogsArray));
        }
    }
}
