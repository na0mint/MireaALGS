package task_2;

public class Subtask1 {

    public static void main(String[] args) {
        TestAuthor testAuthor = new TestAuthor();
    }
    public static class TestAuthor {
        public Author author = new Author("Test", "test@mail.ru", 'm');

        {
            System.out.println(author.getName());
            System.out.println(author.getEmail());
            System.out.println(author.gender);
            System.out.println(author);
        }
    }


    public static class Author{
        private String name;
        private String email;
        private char gender;

        Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return String.format("Name: %s\nEmail: %s\nGender: %s\n", name, email, gender);
        }
    }
}
