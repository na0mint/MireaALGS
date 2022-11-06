package task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Subtask4 {
    public static class Shop {
        public static void main(String[] args) {
            ArrayList<Computer> computers = new ArrayList<>();
            System.out.println("Type 'c' to create, 'f' to find, 'd' to delete, 's' to show all computers,'q' to shut down.");

            Scanner reader = new Scanner(System.in);

            char function = 0;
            boolean isWorking = true;

            while (isWorking) {
                System.out.println("Type a command: ");
                try {
                    function = reader.nextLine().charAt(0);
                } catch (StringIndexOutOfBoundsException e) {
                    function = reader.nextLine().charAt(0);
                }
                if (function == 'q') {
                    isWorking = false;
                }

                switch (function) {
                    case 'c':
                        System.out.println("Your are going to add a new computer. Enter hard disk capacity, diagonal, cost: ");

                        double newHardDiskCapacity = reader.nextDouble();
                        double newDiagonal = reader.nextDouble();
                        double newCost = reader.nextDouble();

                        computers.add(new Computer(newHardDiskCapacity, newDiagonal, newCost));

                        break;

                    case 's':
                        for (Computer comp : computers) {
                            System.out.println(computers.indexOf(comp) + ": " + comp.toString() + "\n");
                        }

                        break;

                    case 'd':
                        System.out.println("Enter an index of the computer you want to delete: ");

                        int index = reader.nextInt();

                        computers.remove(index);

                        break;

                    case 'f':
                        System.out.println("To find a computer enter a hard disk capacity and diagonal: ");

                        double customerHardDiskCapacity = reader.nextDouble();
                        double customerDiagonal = reader.nextDouble();

                        System.out.println("Computers: ");

                        computers.stream().filter(computer -> computer.getHardDiskCapacity() == customerHardDiskCapacity && computer.getDiagonal() == customerDiagonal).forEach(System.out::println);

                        break;
                    case 'q':
                        System.out.println("Bye");

                        break;

                    default:
                        System.out.println("Try again");
                }
            }
        }

            public static class Computer {
                private double hardDiskCapacity;
                private double diagonal;
                private double cost;

                Computer(double hardDiskCapacity, double diagonal, double cost) {
                    if(hardDiskCapacity > 0 && diagonal > 0 && cost > 0) {
                        this.hardDiskCapacity = hardDiskCapacity;
                        this.diagonal = diagonal;
                        this.cost = cost;
                    } else {
                        return;
                    }
                }

                public void setHardDiskCapacity(double hardDiskCapacity) {
                    if(hardDiskCapacity > 0) {
                        this.hardDiskCapacity = hardDiskCapacity;
                    } else {
                        return;
                    }
                }

                public void setDiagonal(double diagonal) {
                    if(diagonal > 0) {
                        this.diagonal = diagonal;
                    } else {
                        return;
                    }
                }

                public void setCost(double cost) {
                    if(cost > 0) {
                        this.cost = cost;
                    } else {
                        return;
                    }
                }

                public double getHardDiskCapacity() {
                    return hardDiskCapacity;
                }

                public double getDiagonal() {
                    return diagonal;
                }

                public double getCost() {
                    return cost;
                }

                @Override
                public String toString() {
                    return String.format("hard disk: %f\ndiagonal: %f\ncost: %f", hardDiskCapacity,  diagonal, cost);
                }
            }
        }


}
