package task_4;

import java.util.Scanner;

public class Subtask1 {
    enum Season {
        Autumn("Autumn","1st September","31st November",15),
        Winter("Winter","1st December","28 or 29 of February",-25),
        Spring("Spring","1st March","31st May",10),
        Summer("Summer","1st June","31st August",25);

        private final String title;

        final public static String titleAutumn = "Autumn";
        final public static String titleWinter = "Winter";
        final public static String titleSpring = "Spring";
        final public static String titleSummer = "Summer";



        private final String firstDay;
        private final String lastDay;
        private final double degree;


        Season(String title,String firstDay,String lastDay, double degree) {
            this.title = title;
            this.firstDay=firstDay;
            this.lastDay=lastDay;
            this.degree = degree;
        }

        public double getDegree() {
            return degree;
        }
        public String getFirstDay(){return firstDay;}

        public String getLastDay(){return lastDay;}

        public void getDescription(){
            switch (title) {
                case (titleAutumn) -> System.out.println("Not hot but still not cold");
                case (titleWinter) -> System.out.println("Very very cold");
                case (titleSpring) -> System.out.println("Not cold but still not hot");
                case (titleSummer) -> System.out.println("Very very hot");
                default -> throw new IllegalStateException("Unexpected value: " + title);
            }
        }
    }


    public static class SeasonTest {
        public static void getDescription(Season season){
            if(season == Season.Autumn){
                System.out.println("Тёплое время года");
            }
            else if(season.getDegree()<0){
                System.out.println("Холодное время года");
            } else {
                System.out.println("Тёплое время года");
            }
        }

        public static void enTell(Season season){
            switch (season){
                case Autumn -> System.out.println("Я люблю осень");
                case Summer -> System.out.println("Я люблю лето");
                case Spring -> System.out.println("Я люблю весну");
                case Winter -> System.out.println("Я люблю зиму");
            }
        }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            Season season1 = Season.Summer;
            Season season2 = null;

            boolean f = true;
            while(f){
                String choice = in.nextLine();
                switch (choice) {
                    case (Season.titleAutumn) -> {
                        season2 = Season.Autumn;
                        f = false;
                    }
                    case (Season.titleWinter) -> {
                        season2 = Season.Winter;
                        f = false;
                    }
                    case (Season.titleSpring) -> {
                        season2 = Season.Spring;
                        f = false;
                    }
                    case (Season.titleSummer) -> {
                        season2 = Season.Summer;
                        f = false;
                    }
                }
            }

            System.out.println(season1);
            System.out.println(season2);
            season1.getDescription();
            season2.getDescription();
        }
    }
}
