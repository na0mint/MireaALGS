package task_4.task_4_1;

import java.util.Calendar;

public class Subtask5 {
    public class Reader {
        private String fullName;
        private int numberOfTicket;
        private String faculty;
        private Calendar dateOfBirth;
        private long phoneNumber;

        public void takeBook(int number) {
            System.out.printf("%s взял %d книг\n", fullName, number);
        }

        public void takeBook(String... books) {
            System.out.printf("%s взял книги: ", fullName);
            for(String book : books) {
                System.out.print(book);
            }
        }

        public void takeBook(Book... books) {
            System.out.printf("%s взял книги: ", fullName);
            for(Book book : books) {
                System.out.print(book.getName());
            }
        }

        public void returnBook(int number) {
            System.out.printf("%s вернул %d книг\n", fullName, number);
        }

        public void returnBook(String... books) {
            System.out.printf("%s вернул книги: ", fullName);
            for(String book : books) {
                System.out.print(book);
            }
        }

        public void returnBook(Book... books) {
            System.out.printf("%s вернул книги: ", fullName);
            for(Book book : books) {
                System.out.print(book.getName());
            }
        }
    }
    public class Book {
        private String name;
        private String author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }
    }


}
