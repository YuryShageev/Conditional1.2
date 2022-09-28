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
    }
}