public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Task 1");
        int age = 10;
        boolean goesToKindergarten = age >= 2 || age <= 6;
        if (goesToKindergarten) {
            System.out.println("Если возраст человека от 2 до 6, то ему нужно ходить в садик");
        } else {
            System.out.println("Если возраст человека не от 2 до 6, то ему не нужно ходить в садик");
        }
        if (age >= 7 || age < 18) {
            System.out.println("Если возраст человека от 7 до 18, то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека не от 7 до 18, то ему не нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека от 18 до 24, то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека не от 18 до 24, то ему не нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека больше 24, то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека не больше 24, то ему не нужно ходить на работу");
        }

        //Задание 2
        System.out.println("Task 2");

        int child = 12;
        boolean canNotRide = child < 5;
        boolean canRideWithParent = child >= 5 || child <= 14;
        boolean canRideAlone = child > 14;
        if (canNotRide) {
            System.out.println("Нельзя кататься! Ещё мал!");
        } else {
            System.out.println("Можно кататься");
        }
        if (canRideWithParent) {
            System.out.println("только в сопровождении родителя");
        } else {
            System.out.println("Сколько человеку лет?");
        }
        if (canRideAlone) {
            System.out.println("Можете свободно кататься");
        } else {
            System.out.println("Сколько человеку лет?");
        }

        // задание 3
        System.out.println("Task 3");

        int one = 1;
        int two = 2;
        int three = 3;
        boolean notBigger = one > two && one > three;
        boolean stillNotBigger = two > three;
        boolean biggest = three > two;
        if (biggest) {
            System.out.println("Число three больше, чем two или one");
        } else {
            System.out.println("Число three не больше, чем two или one");
        }
        if (stillNotBigger) {
            System.out.println("Число two больше, чем three или one");
        } else {
            System.out.println("Число two не больше, чем three");
        }
        if (notBigger) {
            System.out.println("Число one больше, чем two или three");
        } else {
            System.out.println("Число one не больше, чем two или three");
        }
    }
}